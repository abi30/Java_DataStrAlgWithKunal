package day_2;

public class SearchInMountain {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {

    int[] arr={1,2,4,5,4,3,2,1};
    System.out.println(search(arr,4));


    }

    public static   int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=binarySeach(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return  binarySeach(arr,target,peak,arr.length-1);

    }

    static int binarySeach(int[] arr,int target,int start,int end) {

        boolean isAsendining=arr[start]<arr[end];



        while(start<=end) {


            int mid=start+(end-start)/2;

            if(arr[mid]==target) {

                return mid;
            }

            if(isAsendining) {
                if(target<arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else {
                if(target>arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }


        }

        return -1;


    }


    static int peakIndexInMountainArray(int[] arr) {
        //  int max=Integer.MIN_VALUE;
        int start=0;
        int end =arr.length-1;

        while(start < end) {

            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]) {
                // you are in dce part of Array
                //this may be answer
                //this is why end != mid-1
                end=mid;
            }else {
                //your are in ace part of Array
                start=mid+1;
            }

        }

        // in the end , start == end and pointing to the largest number
        // because of the 2 checks above
        // start and end are always trying ot find max element

        return end;
        //return start;


    }


}

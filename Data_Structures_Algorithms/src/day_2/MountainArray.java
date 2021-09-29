package day_2;

public class MountainArray {

    public static void main(String[] args) {

        int[] arr={2,3,4,5,8,7,1};
        System.out.println(peakIndexInMountainArrayExtra(arr));
        System.out.println(peakIndexInMountainArray(arr));
    }



    public static int peakIndexInMountainArrayExtra(int[] arr) {
        int max=0;

        for(int i=0;i<arr.length;i++){

            if(max<=arr[i]){
                max=arr[i];
            }else {
                return i-1;
            }

        }



        return  -1;
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

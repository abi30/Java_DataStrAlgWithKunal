package day_2;

public class SplitArrOwn410 {
    public static void main(String[] args) {
        int[] arr={4,11,3,5,12,6};
        int m=3;
        int output= splitArray(arr,m);
        System.out.println(output);
    }

    public static int splitArray(int[] arr, int m){

        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]); // max value in the Array
            end +=arr[i];//total sum of array
        }
        while (start<end){

            int mid=start+(end-start)/2;//
            int sum=0;
            int split=1;
            for (int i = 0; i < arr.length; i++) {

            if (sum+arr[i]<mid){
                sum+=arr[i];
            }else {
                sum=arr[i];
                split++;
                }
            }
            if(split<m){
                end=mid;
            }else {
                start=mid+1;
            }
        }

    return end;
    }
}

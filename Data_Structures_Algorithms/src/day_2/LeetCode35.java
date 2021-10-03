package day_2;

public class LeetCode35 {
    public static void main(String[] args) {


    }
    public int searchInsert(int[] arr, int target) {

        int start=0;
        int end =arr.length-1;

        while(start<=end) {

            int mid=start+(end-start)/2;

            if(target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}

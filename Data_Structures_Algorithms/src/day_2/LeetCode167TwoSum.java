package day_2;

import java.util.Arrays;

public class LeetCode167TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15,23};
        int target=32;
        System.out.println(Arrays.toString(indexOfTwoNumbersSum(arr,target)));
    }
    static int[]indexOfTwoNumbersSum(int[]arr,int target){
        if(arr==null||arr.length==0){
            return new int[]{-1,-1};
        }

        int start=0;
        int end =arr.length-1;

        while (start<end){
            int windowsSum=arr[start]+arr[end];
            if (windowsSum<target){
                start++;
            }else if (windowsSum>target){
                end--;
            }else {
                return new int[]{1+start,1+end};
            }
        }

        return new int[]{-1,-1};
    }
}

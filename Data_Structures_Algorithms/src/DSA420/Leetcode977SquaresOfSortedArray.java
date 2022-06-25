package DSA420;

import java.util.Arrays;

public class Leetcode977SquaresOfSortedArray {
    public static void main(String []args){


        int[] array={-4,-1,0,3,10};

//        int[] retval=sortedSquares(array);
        System.out.println(Arrays.toString(sortedSquares(array)));

    }
    public static  int [] sortedSquares(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}

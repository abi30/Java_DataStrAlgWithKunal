package day_2;

import java.util.Arrays;

public class NumberStartEnd {
    public static void main(String[] args) {

            // search the index of the target value...

            int[] arr= {5,7,7,7,7,8,8,10};

            int target=7;
            int[] ans=numberSearch(arr,target);
            System.out.println(Arrays.toString(ans));

        }

        static int[] numberSearch(int[] nums,int target) {

            if(nums.length == 0){
                return new int[]{-1,-1};
            }

            // check for first occurrence if target first
            int start=search(nums,target,true);
            int end =search(nums,target,false); 
            
            
            return new int[]{start,end};
        }


        // this function just returns the index value of target

    static  int search(int[] nums,int target, boolean findStartIndex){

        int ans=-1;
        int start=0;
        int end =nums.length-1;

        while(start<=end) {

            int mid=start+(end-start)/2;

            if(target<nums[mid]) {
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else {
                // potation ans is found
                ans = mid;
                if(findStartIndex==true){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }

        return  ans;

    }
}

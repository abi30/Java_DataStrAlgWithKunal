package day_2;

import java.util.Arrays;

public class LeetCode1385FindTheDistanceValue {

    public static void main(String[]args){


        int arr1[]={-3,10,2,8,0,10};
        int arr2[]={-9,-1,-4,-9,-8};
        int d = 9;
        int count = findTheDistanceValue(arr1,arr2,d);
        System.out.println(count);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean check = true;

        Arrays.sort(arr2);

        for(int i = 0; i<arr1.length ; i++ ){

            int start =0;
            int end = arr2.length-1;

            while(start<=end){
                int  mid = start +(end-start)/2;
                if(Math.abs(arr1[i]-arr2[mid])<=d){
                    check = false;
                    break;
                }else if(arr2[mid] > arr1[i]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            if(check){
                count ++;
            }else {
                check = true;
            }

        }
        return count;
    }

}

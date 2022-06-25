package DSA420;

import java.util.Arrays;

public class Leetcode88MergeSortedArray {

    public static void main(String[]args){

        int[]a={3,5,4};

        a[2]=5;
        System.out.println(Arrays.toString(a));
        int[] nums1={4,7,9,0,0,0};
        int[] nums2={2,5,6};

//        merge1(nums1,3,nums2,3);
        merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=j+i+1;

        while (i>=0 && j>=0){

            // 4 7 9 0 0 0// 2 4 6
            if(nums1[i]<nums2[j]){

            }else{
                nums1[k--]=nums2[k];
            }
        }


    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = i+j+1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else{

                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }




}

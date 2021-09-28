package day_1;

import java.util.Arrays;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,5,32,1,23,7,4};
		
		swap(arr,3,3);
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void reverse(int[] arr) {
		int start=0;
		int end= arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	
	} 
	
	
	public static void swap(int[]arr,int index1,int index2) {

		
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

}

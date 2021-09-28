package day_1;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	int[] arr= {4,5,6,1,23,7,2};
		
		System.out.println("max item is:"+max(arr));
		
		System.out.println("max item is with range:"+maxRange(arr,2,4));

	}

	
	private static int max(int[] arr) {
		
		int maxValue=arr[0];
		for(int i=1; i<arr.length;i++) {
			
			if(maxValue <= arr[i]) {
				maxValue = arr[i];
			}
			
		}
		
		
		return maxValue;
		
	}
	
	
private static int maxRange(int[] arr,int start,int end) {
	
	if(start>end) {
		return -1;
		
	}
	if(arr==null) {
		return -1;
	}	
		int maxValue=arr[start];
		for(int i=1; i<=end;i++) {
			
			if(maxValue <= arr[i]) {
				maxValue = arr[i];
			}
			
		}
		
		
		return maxValue;
		
	}
}

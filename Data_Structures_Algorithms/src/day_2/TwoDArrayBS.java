package day_2;

import java.util.Arrays;

public class TwoDArrayBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] arr= {{ 1, 3, 5, 7}};
		int target= 3;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(search(arr,target)));
	}
	
	static int[] search(int[][] arr,int target) {

		if (arr.length==1){
			int s=0;
			int e=arr[0].length-1;

			while (s<=e){
				if(arr[s][e]==target) {
					return new int[] {s,e};
				}
				if(arr[s][e]<target) {
					s++;
				}else {

					e--;
				}

			}
			return new int[]{-1,-1};
		}

		int row=0;
		int col=arr.length-1;
		
		while(row<arr.length && col>=0) {
			
			if(arr[row][col]==target) {
				return new int[] {row,col};
			}
			if(arr[row][col]<target) {
				row++;
			}else {
				
				col--;
			}
			
			
		}

		return new int[]{-1,-1};
	}

}

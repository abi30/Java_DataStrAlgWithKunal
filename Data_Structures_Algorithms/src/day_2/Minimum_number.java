package day_2;

import java.util.Arrays;

public class Minimum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {
				{3,2,3,54,7},
				{16,-8,-7},
				{43,2,14,20}};

		System.out.println(Arrays.toString(minN(arr)));
//		is very very importent::::!!
		System.out.println(maxN(arr));
	}
	
	
	static int[] minN(int[][] arr) {
		int[] result=new int[3];
		if(arr.length==0) {
			return new int[]{-1,-1};
		}
		int minNumber=	arr[0][0];
		int row=0;
		int col=0;
		for(int i=0;i<arr.length;i++) {
			row=i;
			for(int j=0;j<arr[i].length;j++) {
			col=j;
			if(minNumber>=arr[i][j]) {
			     minNumber =arr[i][j];
			    
			     
//				if(arr[i][j]==tergate) {
		    	}
			}
			
		}
		return new int[] {row,col,minNumber};
//		return new int[]{-1,-1};
	
	}
		
		
	
	static int maxN(int[][] arr) {
		if(arr.length==0) {
			return 0;
		}
		
	
		int maxNumber=	arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				if(maxNumber<=arr[i][j]) {
			maxNumber =arr[i][j];
				
			}
			}
			
		}
		
		return maxNumber;
	}

}

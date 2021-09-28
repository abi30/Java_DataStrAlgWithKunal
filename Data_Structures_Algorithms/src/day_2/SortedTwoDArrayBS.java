package day_2;

import java.util.Arrays;

public class SortedTwoDArrayBS {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		int[][] arr=  { { 1, 2, 3, 4, 5},
				     	{ 6, 7, 8, 9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
				        {21,22,23,24,25}
			      };
	int target=24;
	System.out.println(Arrays.toString(search(arr,target)));
	}

	// search in the row provided between the column provided
	static int[] binarySearch(int[][] arr,int row, int cStart,int cEnd,int target) {
		 	while (cStart<=cEnd) {
		 		int mid=cStart+(cEnd-cStart)/2;
		 		
		 		if(arr[row][mid]==target) {
		 			return new int[] {row,mid};
		 		}
		 		
		 		if(arr[row][mid]<target) {
		 			 cStart=mid+1;
		 		
		 		}else {
		 			
		 			cEnd= mid-1;
					 //cStart=mid-1;
		 		}
		 	}
		
		return new int[]{-1,-1};
	}
	
static int[] search(int[][] arr,int target) {
		
		int rows=arr.length;
		int cols=arr[0].length;// be cautious matrix may be empty

		
		
			
			if(rows==1) {
				return binarySearch(arr,0,0,cols-1,target);
			}
			
			// run the loop till 2 rows are remaining!
			
			int rStart=0;
			int rEnd=rows-1;
			int cMid=cols/2;
			
			while(rStart<(rEnd-1) ) { // while this is true

				//  here is cutting the rows that means showed be minimized.

				int mid = rStart + (rEnd - rStart) / 2;
				if(arr[mid][cMid]==target) {
					return new int[]{mid,cMid};
				}
					if(arr[mid][cMid]>target) {

						rEnd=mid;
					}else {
						rStart=mid;
					}
				}
				
				
			
			
			//now we have two rows
			// check whether the target is in the col of 2 rows
			
			
			if(arr[rStart][cMid]==target) {
				return new int[] {rStart,cMid};
			}
		
			if(arr[rStart+1][cMid]==target) {
				return new int[] {rStart+1,cMid};
			}
			
			
			// search in 1st halt
			if(target<=arr[rStart][cMid-1]) {
					
				return binarySearch(arr,rStart,0,cols-1,target);
				
			}
			// search in 2nd halt
			if(target>=arr[rStart][cMid+1] && target<=arr[rStart][cols-1] ) {
				
				return binarySearch(arr,rStart,0,cols-1,target);
				
			}
			// search in 3rd halt
			if(target<=arr[rStart+1][cMid-1]) {
				
				return binarySearch(arr,rStart+1,0,cols-1,target);
				
			}
			// search in 4th halt
			if(target<=arr[rStart+1][cMid+1] && target<=arr[rStart+1][cols-1]) {
				
				return binarySearch(arr,rStart+1,0,cols-1,target);
				
			}
			
		
		
		
		
		return new int[]{-1,-1};
	}
}

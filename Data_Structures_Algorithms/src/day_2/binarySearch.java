package day_2;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// search the index of the target value...
		
		int[] arr= {-19,-11,-9,-3,1,5,11,14,17, 20, 21, 23, 29};
		int[] arr2= {32,19,11,9,3,2,-1,-5,-11,-14,-17,-21,-23,-29};
		int target=-14;
		int ans=binarySeach(arr2,target);
		System.out.println(ans);
		
	}
	
	static int binarySeach(int[] arr,int target) {
		
		int start=0;
		int end =arr.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(target>arr[mid]) {
				end=mid-1;
			}else if(target<arr[mid]){
				start=mid+1;
			}else {
				return mid;
			}
			
		}
		
		return -1;
	
	
	}

}

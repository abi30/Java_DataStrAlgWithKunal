package day_2;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// search the index of the target value...
		
		int[] arr1= {1,3,5,6};
		int[] arr2= {32,19,11,9,3,2,-1,-5,-11,-14,-17,-21,-23,-29};
		int target_1=2;
		int target_2= -14;
		int ans1=binarySeachA(arr1,target_1);
		int ans2=binarySeachD(arr2,target_2);
		System.out.println(ans1);
		System.out.println(ans2);

	}
	
	static int binarySeachA(int[] arr,int target) {
		
		int start=0;
		int end =arr.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}else {
				// ans found
				return mid;
			}
			
		}
		
		return -1;
	
	
	}
	static int binarySeachD(int[] arr,int target) {

		int start=0;
		int end =arr.length-1;

		while(start<=end) {

			int mid=start+(end-start)/2;

			if(target>arr[mid]) {
				end=mid-1;
			}else if(target<arr[mid]){
				start=mid+1;
			}else {
				// ans found
				return mid;
			}

		}

		return -1;


	}


}




package day_2;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-19,-11,-9,-3,1,5,11,14,17, 20, 21, 23, 29};
		int[] arr2= {32,19,11,9,3,2,-1,-5,-11,-14,-17,-21,-23,-29};
		int target=-14;
		int ans=binarySeach(arr2,target);
		int ans1=binarySeach(arr,target);

		System.out.println(ans);
		System.out.println(ans1);	
	}
	
	static int binarySeach(int[] arr,int target) {
		int s=0;
		int e=arr.length-1;
		boolean isAsendining=arr[s]<arr[e];

		int start=0;
		int end =arr.length-1;
		
		while(start<=end) {

		
			int mid=start+(end-start)/2;
			
	            if(arr[mid]==target) {
				
	            	return mid;
	            }
			
	            if(isAsendining) {
	            	if(target<arr[mid]) {
	    				end=mid-1;
	    			}else{
	    				start=mid+1;
	    			}
	            }else {
	            	if(target>arr[mid]) {
	    				end=mid-1;
	    			}else{
	    				start=mid+1;
	    			}
	            	
	            }
			
			
		}
		
		return -1;
	
	
	}

}

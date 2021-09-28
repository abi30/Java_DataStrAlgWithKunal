package day_2;

public class SearchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {32,3,54,7,6,87,43,2,14,60};

		int tergate= 3;
		int start=2;
		int end=7;
		
		System.out.println(tergate +" is inside the range :"+search(arr,tergate,start,end));
	}
	
	
	static boolean search(int[] arr,int sucht,int start,int end) {
		if((arr.length==0)||(start>end)) {
			return false;
		}
		
		boolean statement=false;
		for(int i=start;i<=end;i++) {
			
			if(sucht==arr[i]) {
				statement =true;
			
				
			}
		}
		
		return statement;
	}

}

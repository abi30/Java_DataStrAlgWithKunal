package leetcode;


public class main {
	
	
	public static  int[] ArrayPoss(int[]arr,int  target) {
		

		for (int i =0; i<arr.length;i ++) {
			for (int j=i+1;j<arr.length;j++) {
				 int cometment=target-arr[i];
				
				if (cometment==arr[j]) {
					
					return new  int[] {i,j};
				}
				
			}
		
	   }
		throw new IllegalArgumentException("unexcepterd number");
	}
	public static void main(String[] args) {


		int[] array= {4,7,5,3,9};
		int target = 14;
		
		 int r[]=ArrayPoss(array,target);
		 for (int i = 0;i<r.length;i++) {
			 System.out.print(r[i]+" ");
		 }
		 
		

	}
	

}

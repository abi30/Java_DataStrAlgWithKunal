
public class memoization_tabulation {

	public static void main(String[] args) {
	System.out.println(getMinSteps(7));
	int n=1000;
	System.out.println(getMinStepsmeno(n,new int[n+1]));


	}

	
	static int getMinSteps(int n) {
		
		if (n==1) {
			return 0;
		}
		int result= getMinSteps(n-1);
		if(n%2==0) {
			result = Math.min(result, getMinSteps(n/2));
		}
		if(n%3==0) {
			result = Math.min(result, getMinSteps(n/3));
		}
		return result +1;
	}
	
static int getMinStepsmeno(int n ,int[] meno) {
		
		if (n==1) {
			return 0;
		}
		
		if(meno[n]!=0) {
			return meno[n];
		}
		int result= getMinStepsmeno(n-1,meno);
		if(n%2==0) {
			result = Math.min(result, getMinStepsmeno(n/2,meno));
		}
		if(n%3==0) {
			result = Math.min(result, getMinStepsmeno(n/3,meno));
		}
		meno[n]=result+1;
		return meno[n];
	}
	
	
	 
	
}

package day_1;

public class Factorial {
	
	//int facto=1;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int var =iterativeFactorial(5);
		int var2=recursiveFactorial(5);
		System.out.println(var);
		System.out.println(var2);
		
		//Factorial f=new Factorial();
		//int s=f.recursiveFactorial(5);
		//System.out.println("factorial_of the num"+s);
		
	}	
	
	//2!=2*1=2*1!
	//3!=2*1=2*1!
	//4!=4*3*2*1=4*3!
	//n!=n(n-1)!
	
	
	public static int recursiveFactorial(int num) {
		
		
		// this the best case for algo
		if (num==0) {
			return 1;
		}
		return num* recursiveFactorial(num-1);
		
		/*	if (num==0) {
			return 1;
		}
		if(num>1) {
			facto*=num;
			recursiveFactorial(num-1);
		}
		return facto;
		
		*/
		
	}
	
		public static int iterativeFactorial(int num) {
			
			if (num==0) {
				return 1;
			}
			
			int factorial =1;
			for(int i=1;i<=num ; i++) {
				factorial*=i;
				
			}
		
				return factorial;
			
	}

}

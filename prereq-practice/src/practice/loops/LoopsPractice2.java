package practice.loops;

public class LoopsPractice2 {

	public static void main(String[] args) {
		
		
//	String name ="rakibrakinabdullasuman";
		
		int count_even=0;
		int count_odd=0;
	
	for(int i=47;i<=119;i++) {
		
		if ((i>0)&&(i%2==0)) {
		System.out.println("print: "+i);
		count_even+=1;
		}
		
	}
	System.out.println("total even number : "+count_even);
for(int i=47;i<=119;i++) {
		
		if ((i>0)&&(i%2!=0)) {
		System.out.println("printodd: "+i);
		count_odd++;
		
		}
		
	}
System.out.println("total odd number : "+count_odd);
	
	

	}

}

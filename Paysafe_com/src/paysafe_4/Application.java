package paysafe_4;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		dog d=new dog();
		
		try {
			int  arr[] =new int [4];
			arr[4]=43;
		}catch(Exception e1) {
			System.out.println("Exception : "+e1);
			
		}
		finally {
			
			
		try {
		int x =10;
		int y=0;
		int result=x/y;
		System.out.println("print result :"+result);
			
		}catch(Exception e){
			System.out.println("Exception : "+e);
			
		}finally {
					d.eat();
					System.out.println("everthing are going well!");
		}
			
		}
		
		
		
	

		
		
	}

}

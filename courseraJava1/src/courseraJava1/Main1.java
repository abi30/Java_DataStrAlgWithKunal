package courseraJava1;

public class Main1 {

	

	static int f(int x,int y) {
		if (x<y) {
			System.out.println("x<y");
			return x+y;
		}
		else {
			System.out.println("x>=y");
			if(x>8) {
				return y+7;
			}
		}
		return x-2;
	}
	static int g() {
		int a=f(3,4);
		int b=f(a,5);
		return b;
		
	}

	public static void main(String[] args) {

		System.out.println(g());
	}

}
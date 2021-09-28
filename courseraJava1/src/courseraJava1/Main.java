package courseraJava1;

public class Main {

	static int myFunction(int x, int y) {
		int z = 2 * x - y;
		return z * x;
	}

	static int f(int n) {
		return 3 + myFunction(n, n + 1);
	}
	static int g() {
		int a=myFunction(3,7);
		int b=f(a*a);
		return b;
		
	}

	public static void main(String[] args) {

		System.out.println(g());
	}

}

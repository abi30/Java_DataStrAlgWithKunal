package courseraJava1;

public class Main2 {
	static int func2(int w) {
		return w * 3;
	}

	static int func1(int a, int b) {
		int n = a + b;
		return 2 + func2(n);
	}

	static int start() {
		int z = 4;
		return func1(z, 1) - 3;
	}

	static int g(int a) {
		if (a < 9) {
			return 9;
		}

		if (a < 7) {
			return 7;
		}

		if (a < 4) {
			return 4;
		}

		return 0;
	}

	static int k(int a, int b) {
		if (a < b) {
			if (b > 4) {
				return 0;
			} else {
				return 1;
			}
		} else {
			if (a > 4) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	public static void main(String[] args) {

//		System.out.println(start());
//		System.out.println(g(5));
		System.out.println(k(6,6));
	}

}

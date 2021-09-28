	package New_Java_p;
	
	import java.util.Scanner;
	
	public class Pattern_2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
//			Scanner s2 = new Scanner(System.in);
//			int n = s2.nextInt();
//	
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
			
			Scanner s2 = new Scanner(System.in);
			int n = s2.nextInt();
			
			for (int i = 1; i <= n; i++) {
				
				for (int k= 1; k<=i-1;k++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= (n-i)+1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	
	}

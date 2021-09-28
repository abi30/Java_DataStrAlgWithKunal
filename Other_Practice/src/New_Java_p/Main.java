		package New_Java_p;
		
		import java.util.Scanner;
		
		public class Main {
		
			public static void main(String[] args) {
			
				Scanner s1 = new Scanner(System.in);
				int n = s1.nextInt();
				s1.close();
				for (int i=1; i<=n; i++) {
					for (int j=1; j<=n; j++) {
					System.out.print("* ");
					}
					System.out.println();
				}
			}
		
		}

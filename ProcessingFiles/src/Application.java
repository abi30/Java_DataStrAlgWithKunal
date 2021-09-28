import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		File file = new File("MyFle.txt");
		try {
			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				String fileText = input.nextLine();
				System.out.println(fileText);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("sorry file has not been found " + e);

		}

		FileUtils exam = new FileUtils();
		try {
			System.out.print("please give your your number :");
			Scanner input1 = new Scanner(System.in);
			int number = input1.nextInt();

			int num = exam.Subtract10fromLargeNumber(number);
			System.out.println(num);

		} catch (Exception e) {

			System.out.println("your entered false value :" + e);

		}

	}

}

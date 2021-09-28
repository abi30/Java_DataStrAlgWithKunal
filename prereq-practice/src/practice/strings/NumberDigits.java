package practice.strings;

import java.util.Scanner;

public class NumberDigits {

	public static void main(String[] args) {

		
		System.out.print("please enter your text :");
		Scanner object = new Scanner(System.in);
		
		String string=object.nextLine();

		Integer_control obj = new Integer_control();

		System.out.println(obj.isInteger(string));

	}
}
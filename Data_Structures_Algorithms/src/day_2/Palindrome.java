package day_2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String origin;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string to check if it is a palindorme: ");
		origin=in.nextLine();
		System.out.print("Enter a number to check if it is a palindorme: ");
		int number=in.nextInt();
		in.close();
	
		System.out.println("Is it Palendrome :"+palindrome_check(origin));
		
		number_palindrome(number);
		//we r gonna make another function or method for check palindrome number!
		
//		System.out.println(origin);
//		System.out.println(number);
		
	}
	
	public static boolean palindrome_check(String origin) {
		
		boolean palindrome=false;
		
		
		String reverse="";
		int length= origin.length();
		for(int i=length-1;i>=0;i--) {
			reverse+=origin.charAt(i);
		}
		if(origin.equals(reverse)) {
			palindrome = true; 
		}
		
		return palindrome;
				
	}

	public static void number_palindrome(int number) {
		
		int rest;
		int sum=0;
		int temp=number;
		
		while(number>0) {
			rest=number%10;
			sum=(sum*10)+rest;
			number/=10;
		}
		if(temp==sum){
			System.out.println("Entered number is a palindrome!");
		}else {
			System.out.println("Entered numbere isn't a palindrome!");
			
		}
	}
	
	
}

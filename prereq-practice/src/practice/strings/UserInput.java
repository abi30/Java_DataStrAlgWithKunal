package practice.strings;
import java.io.*;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader i= new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader (i);
		int a =Integer.parseInt(br.readLine());
		int b =Integer.parseInt(br.readLine());

		int SOMA =a+b;
		System.out.println("SOMA ="+SOMA );

	}
}

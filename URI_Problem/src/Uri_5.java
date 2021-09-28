import java.io.*;
import java.util.Scanner;

public class Uri_5 {

	public static void main(String args[]) throws Exception {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);

	float a = Float.parseFloat(br.readLine());
	float b = Float.parseFloat(br.readLine());
		double media = (float)(((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));
		System.out.printf("MEDIA = %.5f",media);

		System.out.println("\n");
	}

}

package com.rakib.filereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {

		File file = new File("MyFile.txt");
	

		try(	FileReader  filereader = new FileReader(file);

				BufferedReader bufferedreader = new BufferedReader(filereader);){

		

			String line = bufferedreader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedreader.readLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (IOException e) {
			System.out.println("problem with File reading :" + file.getName());
		} 

	}

}

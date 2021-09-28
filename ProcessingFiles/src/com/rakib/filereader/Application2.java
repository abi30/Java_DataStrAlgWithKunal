package com.rakib.filereader;

class Myclass implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("closing..baby");

	}

}

public class Application2 {

	public static void main(String[] args) {

		try (Myclass var = new Myclass();) {

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

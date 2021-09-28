package com.beingPro.threading;

public class Application {

	public static void main(String[] args) {

		
	
		
		Thread t1 =new Thread( new Task("Rakin Thread"));
		t1.start();

		Thread t2 = new Thread(new Task("Rakib Thread "));
		t2.start();

	}

}

class Task implements Runnable {

	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for (int j = 0; j <= 8; j++) {
			System.out.println("hello here.." + j + "--" + Thread.currentThread().getName());
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
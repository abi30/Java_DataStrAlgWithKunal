package com.rakib.threadPools;

import java.util.concurrent.*;

public class ThreadPoolDemo {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); // Recycle Threads

		Runnable processor = new MassageProcessor(2);
		executor.execute(processor);
		Runnable processor2 = new MassageProcessor(3);
		executor.execute(processor2);
		Runnable processor3 = new MassageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MassageProcessor(5);
		executor.execute(processor4);

		executor.shutdown(); // Rejects any new Tasks from being Submitted.Gratefully shutdown the service.
//		executor.shutdownNow(); // terminated the executor immediately .
	
		try {
			executor.awaitTermination(4,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("submitted all tasks...");
	}

}
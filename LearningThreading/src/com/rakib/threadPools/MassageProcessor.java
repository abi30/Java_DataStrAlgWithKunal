package com.rakib.threadPools;


public class MassageProcessor implements Runnable {
	private int massage;

	public MassageProcessor(int massage) {
		this.massage = massage;
	}

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName()+" received Massage "+massage);
respondToMassage();
System.out.println(Thread.currentThread().getName()+" (Done) Processing "+ massage);

		
	}

	private void respondToMassage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			System.out.println("unable to process Massage "+massage);
		}
		
		
	}
	

}

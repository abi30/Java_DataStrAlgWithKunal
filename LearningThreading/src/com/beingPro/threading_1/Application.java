package com.beingPro.threading_1;

public class Application {

	public static void main(String[] args) {
		
		
		Sequence sequence1 = new Sequence();
		
	Worker worker1 =new Worker(sequence1) ;
	worker1.start();
	
	Worker worker2 =new Worker(sequence1) ;
	worker2.start();
		
		
	}

}
class Worker extends Thread{
	
	Sequence sequence1=null;

	public Worker(Sequence sequence1) {
		this.sequence1 = sequence1;
	}
	public void run() {
for (int i =1;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName()+ " got value :  "+sequence1.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

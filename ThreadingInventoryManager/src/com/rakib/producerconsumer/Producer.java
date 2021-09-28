package com.rakib.producerconsumer;

import java.util.List;

public class Producer implements Runnable  {

	List<Integer> questionsList=null;
	final int LIMIT= 5;
	private int questionOn;
	
	Object myObject = new Object ();
	
	public Producer(List<Integer> questionsList) {
		this.questionsList=questionsList;
	}

	public void readQuestion(int questionOn ) throws InterruptedException {
		
		synchronized(questionsList) {
		while (questionsList.size()==LIMIT) {
			System.out.println("questions have piled up ...waiting for Answer..!!");
			questionsList.wait();
			}
		}
		synchronized(questionsList) {
			System.out.println("new  question : "+questionOn);
			questionsList.add(questionOn);
			Thread.sleep(100);
			questionsList.notify();
			
		}
		
	}

	@Override
	public void run() {
	
		
		while (true) {
			try {
				readQuestion(questionOn++);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}

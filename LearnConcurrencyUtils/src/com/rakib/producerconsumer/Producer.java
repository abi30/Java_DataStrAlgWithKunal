package com.rakib.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionsNo;

	BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		
while(true) {
		try {
			
			synchronized (this) {
				int nextQuestion = questionsNo++;
				System.out.println("got new Question : " + nextQuestion);
				questionQueue.put(nextQuestion);
			}
		} catch (InterruptedException e) {

		}
}

	}

}

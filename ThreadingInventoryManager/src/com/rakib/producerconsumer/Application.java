package com.rakib.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		
		List<Integer> questionsList = new ArrayList<Integer>();
		
		Thread t1=new Thread(new Producer(questionsList));
		Thread t2=new Thread(new Consumer(questionsList));
		
		t1.start();
		t2.start();
	}

}

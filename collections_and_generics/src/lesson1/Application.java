package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
	
		
		ArrayList <String> name=new ArrayList<String>();
		
		name.add("Abi");
		name.add("Abdulla");
		name.add("Al");	
		name.add("Rakib");
		name.add("10");
		
		String item1= name.get(3);
		System.out.println(item1);
		
		
		
		LinkedList <Integer>numbers=new LinkedList<Integer>();
		
		numbers.add(20);
		numbers.add(40);
		numbers.add(24);
		numbers.add(32);
		numbers.add(2);
		numbers.removeFirst();
		numbers.removeLast();
		
		for(int number:numbers) {
			System.out.println(number);
			
		}
	}

}

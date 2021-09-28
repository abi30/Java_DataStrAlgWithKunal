package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Employee> hashset = new HashSet<Employee>();

		hashset.add(new Employee("rakib",2400,"Programming"));
		hashset.add(new Employee("Abid",7000,"Owner"));
		hashset.add(new Employee("Sumon",3400,"Co"));
		hashset.add(new Employee("Adil",2200,"Accounting"));
		hashset.add(new Employee("Jabber",4000,"Chairman"));
		
	
		ArrayList <Employee> li=new ArrayList<Employee>(hashset); 
		 
		Collections.sort(li);

		System.out.println(li);
	
	}

}

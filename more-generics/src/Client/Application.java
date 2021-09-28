package Client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Container <Integer,String,Boolean>container =new Container<>(23,"Abdulla" ,true);
//
//		container.setItem1(32);
//		
//		container.setItem2("rakib");
//	System.out.println(container.getItem1());
//	System.out.println(container.getItem2());
//	container.printsItem();
//	
	Set <String>myset1=new TreeSet<>();
	myset1.add("Abdulla");
	myset1.add("Al");
	myset1.add("rakib");
	
	
	Set <String>myset2=new TreeSet<>();
	myset2.add("Abdulla");
	myset2.add("Al");
	myset2.add("rakin");
	
	Set <String>myset3=new TreeSet<>();
	myset2.add("Abdulla");
	myset2.add("Al");
	myset2.add("mahabub");
	

	
	
	Set<String> resultSet =union(myset1,myset2,myset3);

	Iterator<String> itr = resultSet.iterator();
	while (itr.hasNext()) {
		String var=itr.next();
		System.out.println(var);
	}
	
	}
	public static<E> Set<E> union(Set<E> set1,Set<E> set2 ,Set<E> set3) {
		Set<E> result =new HashSet<>(set1);
		result.addAll(set2);
	
		return result;
	}

}

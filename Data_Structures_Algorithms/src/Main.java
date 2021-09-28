import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//	Array numbers =new Array (4);
//	numbers.insert(20);
//	numbers.insert(40);
//	numbers.insert(70);
//	numbers.insert(60);
//	numbers.insert(50);
//	numbers.insert(43);
//    numbers.insert(40);
//	numbers.removeAt(4);
//		numbers.print();
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.remove(0);
		System.out.println(list.indexOf(20));
		System.out.println(list.contains(40));
		System.out.println(list.toArray());
		System.out.println(list.size());
		
		System.out.println(list);
		
		
	}

}

package LinkedList.com;

public class Main {

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		MyLinkedList<String> llname = new MyLinkedList<>();
		llname.add("rakib");
		llname.add("subas");
		llname.add("ajad");
//		list.removeFirst();
//		list.removeLast();
		
	
		list.print();
		llname.print();
	}

}

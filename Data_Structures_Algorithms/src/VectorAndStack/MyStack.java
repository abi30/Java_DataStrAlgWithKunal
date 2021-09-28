package VectorAndStack;

import LinkedList.com.MyLinkedList;


//Stack with LinkedList

public class MyStack<E> {

	MyLinkedList<E> ll = new MyLinkedList<>();

	void push(E e) {
		ll.add(e);

	}

	E pop() throws Exception {
		if (ll.isEmpty()) {
			throw new Exception("list or Stack is empty sorry !!!");
		}
		return ll.removeLast();

	}

	E peek()throws Exception  {
		if (ll.isEmpty()) {
			throw new Exception ("geting nothing because of empty List");
		}
		return ll.getLast();
	}
	

	}


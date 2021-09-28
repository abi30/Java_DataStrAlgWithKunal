package LinkedList.com;

public class MyLinkedList<E> {
	Node<E> head;

	public static class Node<E> {
		E value;
		Node<E> next;

		public Node(E value) {
			this.value = value;
			this.next = null;
		}

	}

	public void add(E item) {
		Node<E> new_node = new Node<E>(item);
		if (isEmpty()) {
			head = new_node;
			return;
		}
		Node<E> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new_node;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void print() {
		Node<E> current = head;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}

	}

	public E removeLast() throws Exception {
		Node<E> current = head;
		if (current == null) {
			throw new Exception("Stack is empty sorry !!");
		}

		if (current.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.value;

		}

		while (current.next.next != null) {
			current = current.next;
		}
		Node<E> toRemove = current.next;
		current.next = null;

		return toRemove.value;
	}

	public E getLast() throws Exception {
		Node<E> current = head;
		if (current == null) {
			throw new Exception("get nothing value because of empty List");
		}

		while (current.next != null) {
			current = current.next;
		}
		Node<E> toGet = current;

		return toGet.value;
	}

}

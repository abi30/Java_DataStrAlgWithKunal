
public class MyStack {

	int stack[] = new int[4];
	int top = -1;

	void push(int x) {
		if (top < stack.length - 1) {
			top++;
			stack[top] = x;
			System.out.println("successfully added " + x);

		} else {

			System.out.println("Exception error stack overFlow ");

		}
	}

	public int size() {
		return top;
	}

	int pop() {

		int val = stack[top];
		stack[top] = 0;
		top--;
		return val;
	}

	int peek() {
		if (top < 0) {
			System.out.println("Exception UnderFlow");
			return -1;

		}
		return stack[top];
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");

		}
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public static void main(String[] args) {

		MyStack ob = new MyStack();
		System.out.println("value on the top " + ob.peek());
		System.out.println(ob.isEmpty());
		ob.push(12);
		ob.push(13);
		ob.push(14);
		ob.push(15);
		ob.pop();
		System.out.println("value on the top " + ob.peek());
//		ob.push(16);
		ob.show();
		System.out.println();
		System.out.println("stack size is " + ob.size());
		System.out.println("value on the top " + ob.peek());
		System.out.println(ob.isEmpty());

	}
}

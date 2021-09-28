import java.util.concurrent.atomic.AtomicInteger;

class counter {

	AtomicInteger count =new AtomicInteger();

	public void increment() {
		count.incrementAndGet();
	}

}

public class Test_121 {

	public static void main(String[] args) throws InterruptedException {

		counter c = new counter();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}

			}

		});

		t1.start();
		t2.start();
		
		t1.join();
		System.out.println(c.count);
		t2.join();
		System.out.println(c.count);
	}

}

package Thread.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

	private Queue <E>queue;
	private int max =16;
	private ReentrantLock lock = new ReentrantLock(true);
	
	private Condition notEmpty= lock.newCondition();	
	
	private Condition notFull= lock.newCondition();
	public MyBlockingQueue( int max) {
		queue =new LinkedList<>();
		
		this.max = max;
	}
	
	
	public void put (E e) throws InterruptedException{
		lock.lock();
		try {
			while (queue.size()==max) {
//				block the thread
				
				notFull.wait();
			}
			queue.add(e);
			notEmpty.signalAll();
		}
		finally {
			lock.unlock();
		}
		
		
	}
	public E take() throws InterruptedException {
		lock.lock();
		try {
			while (queue.size()==0) {
//				block the thread 
				notEmpty.wait();
				
			}
		E item =queue.remove();
		notFull.signalAll();
		return item ;
		}
		finally {
			lock.unlock();
		}
	}
	
	
}

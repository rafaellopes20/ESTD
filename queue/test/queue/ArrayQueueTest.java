package queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {

	@Test
	public void enqueueTest() {
		ArrayQueue<String> queue = new ArrayQueue<>();

		Assert.assertTrue(queue.isEmpty());

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");

		Assert.assertFalse(queue.isEmpty());
		Assert.assertTrue(queue.getSize() == 3);
	}
	
	@Test
	public void dequeueTest() {
		ArrayQueue<String> queue = new ArrayQueue<>();

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");

		Assert.assertEquals("A", queue.front());
		Assert.assertEquals("A", queue.front());
		
		Assert.assertEquals("A", queue.dequeue());
		Assert.assertEquals("B", queue.dequeue());
		Assert.assertEquals("C", queue.dequeue());
		Assert.assertTrue(queue.isEmpty());
		
	}
	
	@Test
	public void circularTest() {
		ArrayQueue<Integer> queue = new ArrayQueue<>(7);

		Assert.assertTrue(queue.isEmpty());

		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}

}

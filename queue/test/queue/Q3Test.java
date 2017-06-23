package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3(){
		Q3 q3 = new Q3();
		Queue<Integer> q = new ArrayQueue<>();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		Assert.assertTrue(q.getSize() == 3);
		int result = q3.q3(q);
		Assert.assertTrue(result == 6);
		
	}
}

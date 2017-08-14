package matrix;

import org.junit.Assert;
import org.junit.Test;

//7- Receba uma matriz do tipo char, e conte quantas consoantes essa matriz possui
public class Q7Test {

	@Test
	public void q7() {
		Q7 q7 = new Q7();

		char m[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		int result = q7.q7(m);
		
		Assert.assertTrue(result == 6);
	}
}

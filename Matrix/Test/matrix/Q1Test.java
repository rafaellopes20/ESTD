package matrix;
//1- Dada uma matriz de números inteiros, retorne a soma de todos eles.

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1() {
		Q1 q1 = new Q1();
		int matriz[][] = {{1,2},{3,4},{5,6}};
		int result = q1.q1(matriz);
		
		Assert.assertTrue(result == 21);
		
	}
}

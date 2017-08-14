package matrix;
//2- Dada uma matriz de números inteiros, retorne o menor entre eles.

import org.junit.Assert;
import org.junit.Test;


public class Q2Test {

	@Test
	public void q2() {
		Q2 q2 = new Q2();
		int matriz[][] = {{6,8,5},{2,7,3},{9,8,7}};
		int result = q2.q2(matriz);
		
		Assert.assertTrue(result == 2);
	}
}

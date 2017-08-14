package matrix;
//8- Dada uma matriz de double, multiplique seus valores por 2

import org.junit.Assert;
import org.junit.Test;

public class Q8Test {

	@Test
	public void q8() {
		Q8 q8 = new Q8();

		double matriz[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		double actuals[][] = q8.q8(matriz);
		double expecteds[][] = { { 2, 4 }, { 6, 8 }, { 10, 12 } };
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
}

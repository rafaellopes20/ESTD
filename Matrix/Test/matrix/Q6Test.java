package matrix;
//6- Dada uma matriz com no mínimo duas colunas, substitua
//os valores da primeira coluna pelos valores da segunda e vice versa.

import org.junit.Assert;
import org.junit.Test;

public class Q6Test {

	@Test
	public void q6() {
		Q6 q6 = new Q6();
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] actuals = q6.q6(matriz);
		int[][] expecteds = { { 2, 1, 3 }, { 5, 4, 6 }, { 8, 7, 9 } };
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
}

package matrix;
/* 4- Dada uma matriz com no mínimo duas linhas, substitua os valores
 *  da primeira linha pelos valores da segunda e vice-versa.*/

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4() {
		Q4 q4 = new Q4();
		int matrizz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int result[][] = q4.q4(matrizz);
		int expecteds[][] = { { 4, 5, 6 }, { 1, 2, 3 }, { 7, 8, 9 } };
				
		Assert.assertArrayEquals(expecteds, result);
		
	}
}

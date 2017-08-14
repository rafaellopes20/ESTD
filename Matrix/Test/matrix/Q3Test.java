package matrix;
//3- Dada uma matriz com no mínimo duas linhas, substitua os valores da primeira linha pelos valores da segunda.

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3() {
		Q3 q3 = new Q3();
		int matriz[][] = {{6,8,5},{2,7,3},{9,8,7}};
		int result[][] = q3.q3(matriz);
		int expecteds[][] = {{2,7,3},{2,7,3},{9,8,7}};
		
		Assert.assertArrayEquals(expecteds, result);
	}
}

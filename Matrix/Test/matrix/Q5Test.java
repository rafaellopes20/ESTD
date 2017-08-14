package matrix;
//5- Dada uma matriz com no mínimo duas colunas, substitua os valores da primeira coluna pelos valores da segunda.
import org.junit.Assert;
//5- Dada uma matriz com no mínimo duas colunas, substitua os valores da primeira coluna pelos valores da segunda.
import org.junit.Test;

public class Q5Test {

	@Test
	public void q5() {
		Q5 q5 = new Q5();
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int actuals[][] = q5.q5(matriz);
		int expecteds[][] = { { 2, 2, 3 }, { 5, 5, 6 }, { 8, 8, 9 } };
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
}

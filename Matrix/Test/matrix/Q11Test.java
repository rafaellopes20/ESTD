package matrix;
//11- dada uma matriz de double, retorne estes valores divididos por 3.
import org.junit.Assert;
import org.junit.Test;

public class Q11Test {

	@Test
	public void q11() {

		Q11 q11 = new Q11();

		double matriz[][] = { { 3, 3 }, { 6, 6 }, { 9, 9 } };
		double actuals[][] = q11.q11(matriz);
		double expecteds[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		Assert.assertArrayEquals(expecteds, actuals);
	}
}

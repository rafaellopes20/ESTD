package matrix;
import org.junit.Assert;
//10- Dada uma matriz de inteiros, retorne o maior dentre eles
import org.junit.Test;

public class Q10Test {

	@Test
	public void q10() {
		Q10 q10 = new Q10();
		int m[][] = { { 2, 4, 5 }, { 6, 8, 3 }, { 10, 12, 9 } };
		int result = q10.q10(m);
		
		Assert.assertTrue(result == 12);
	}
}

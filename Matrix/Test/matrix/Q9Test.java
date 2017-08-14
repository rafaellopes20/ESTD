package matrix;
//9- Receba uma matriz do tipo char, e conte quantas vogais essa matriz possui
import org.junit.Assert;
import org.junit.Test;

public class Q9Test {
	@Test
	public void q9() {
		Q9 q9 = new Q9();

		char m[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' } };
		int result = q9.q9(m);

		Assert.assertTrue(result == 3);
	}
}

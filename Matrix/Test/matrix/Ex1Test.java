package matrix;

import org.junit.Assert;
import org.junit.Test;
//Receba uma matrix de double e retorne outra matrix multiplicado por 2
public class Ex1Test {

	@Test
	public void ex1() {
		Ex1 ex1 = new Ex1();
		
		double[][] matriz = {{1.0, 2.0},{3.0, 4.0}};
		double[][] Expected = {{2.0, 4.0},{6.0, 8.0}};
		
		double[][] result = ex1.ex1(matriz);
		
		Assert.assertArrayEquals(Expected, result);
	}
}

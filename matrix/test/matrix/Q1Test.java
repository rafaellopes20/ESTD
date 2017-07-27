package matrix;

import org.junit.Assert;
import org.junit.Test;

//Dada uma matriz de decimais (double), retorne outra matriz multiplicando cada item por 2
public class Q1Test {

	@Test
	public void q1(){
		Q1 q1 = new Q1();
		
		double[][] matriz = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
		double[][] matrizExpected = { { 2.0, 4.0, 6.0 }, { 8.0, 10.0, 12.0 } };
		double[][] result = q1.q1(matriz);
		
		Assert.assertArrayEquals(matrizExpected, result);
	}
}

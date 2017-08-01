package matrix;

import org.junit.Assert;
import org.junit.Test;

//Dada uma matriz de decimais (double), retorne outra matriz multiplicando cada item por 2
public class Q1InicialTest {

	@Test
	public void q1Inicial(){
		Q1Inicial q1 = new Q1Inicial();
		
		double[][] matriz = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
		double[][] matrizExpected = { { 2.0, 4.0, 6.0 }, { 8.0, 10.0, 12.0 } };
		double[][] result = q1.q1(matriz);
		
		for (int line = 0; line < result.length; line++) {
			for (int column = 0; column < result[0].length; column++) {
				System.out.println(" |" +result[line][column]);
			}
			System.out.println(" |");
		}
		
		Assert.assertArrayEquals(matrizExpected, result);
	}
}

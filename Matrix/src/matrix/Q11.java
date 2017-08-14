package matrix;
//11- dada uma matriz de double, retorne estes valores divididos por 3.

public class Q11 {
	public double[][] q11(double[][] m) {

		System.out.println("ENTRADA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|" + m[lin][col]);
			}
			System.out.println("|");
		}
		/*
		 * Implementação da Lógica
		 */

		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				m[lin][col] = m[lin][col] /3;
			}
		}

		System.out.println("\nSAIDA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|" + m[lin][col]);
			}
			System.out.println("|");
		}

		return m;
	}
}

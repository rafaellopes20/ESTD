package matrix;
//8- Dada uma matriz de double, multiplique seus valores por 2

public class Q8 {

	public double[][] q8(double[][] m){
		
		int mult = 0;
		
		System.out.println("ENTRADA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|"+m[lin][col]);
			}
			System.out.println("|");
		}
		/*
		 * Implementação da Lógica
		 */
		
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				m[lin][col] = m[lin][col] * 2;
			}
		}
		
		System.out.println("\nSAIDA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|"+m[lin][col]);
			}
			System.out.println("|");
		}
		
		return m;
	}
}

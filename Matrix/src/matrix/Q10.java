package matrix;
//10- Dada uma matriz de inteiros, retorne o maior dentre eles

public class Q10 {

	public int q10(int[][] m) {
		int maior = m[0][0];
		
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
				if(maior < m[lin][col]) {
					maior = m[lin][col];
				}
			}
		}
		System.out.println("\nO maior número encontrado na Matriz foi: "+maior);
		return maior;
	}
}

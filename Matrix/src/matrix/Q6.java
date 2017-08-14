package matrix;

import java.awt.SystemColor;

//6- Dada uma matriz com no mínimo duas colunas, substitua
//os valores da primeira coluna pelos valores da segunda e vice versa.
public class Q6 {

	public int[][] q6(int[][] m) {
		int matriz[][] = m.clone();
		int temp = 0;
		
		System.out.println("ENTRADA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|"+ m[lin][col]);
			}
			System.out.println("|");
		}
		/*
		 * Implementação da Lógica
		 */
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < 1; col++) {
				temp = m[lin][col];
				m[lin][col] = m[lin][col+1];
				m[lin][col+1] = temp;
			}
		}
		
		System.out.println("\nSAIDA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|"+ m[lin][col]);
			}
			System.out.println("|");
		}
		
		return matriz;
	}
}

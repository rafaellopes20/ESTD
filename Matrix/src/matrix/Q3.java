package matrix;

// 3- Dada uma matriz com no mínimo duas linhas, substitua os valores da primeira linha pelos valores da segunda.
public class Q3 {

	public int[][] q3(int[][] m) {
		int matrizNova[][] =  m.clone();
		
		System.out.println("ENTRADA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+m[linha][coluna]);
				
			}
			if(linha != 1) {
				System.out.println("|");
			}
			if(linha == 1) {
				System.out.println("|<-- Esses valores devem aparecer na primeira linha");
			}	
		}
		
		/*
		 * Implementação da lógica
		 */
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				matrizNova[0][coluna] = m[1][coluna];
			}
		}
		
		System.out.println("\nSAIDA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+matrizNova[linha][coluna]);
			}
			if(linha == 0) {
				System.out.println("|<- Mesmos dados da segunda linha");
			}
			if(linha == 1) {
				System.out.println("|<- Dados copiados para a primeira linha");
			}
			if(linha > 1) {
				System.out.println("|");
			}
		}
		
		return matrizNova;
	}
}

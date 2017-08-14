package matrix;

// 5- Dada uma matriz com no mínimo duas colunas, substitua os valores da primeira coluna pelos valores da segunda.
public class Q5 {

	public int[][] q5(int[][] m) {
		
		int matriz[][] = m.clone();
		
		System.out.println("ENTRADA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+m[linha][coluna]);
			}
			System.out.println("|");
		}
		
		/*
		 * Implementação da Lógica
		 */
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				matriz[linha][0] = m[linha][1];
			}
		}
		
		System.out.println("\nSAIDA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+matriz[linha][coluna]);
			}
			System.out.println("|");
		}
		
		return matriz;
	}
}

package matrix;
// 1- Dada uma matriz de números inteiros, retorne a soma de todos eles.
public class Q1 {

	public int q1(int[][] m) {
		int somaMatriz = 0;
		
		System.out.println("ENTRADA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+m[linha][coluna]);
			}
			System.out.println("|");
		}
		
		/*
		 * Implementação da lógica
		 */
		System.out.println("\nSOMATÓRIA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				somaMatriz += m[linha][coluna];
				System.out.print("|"+somaMatriz);
			}
			
		}
		System.out.println("\n\n SOMA TOTAL: "+somaMatriz);
		
		return somaMatriz;
	}
}

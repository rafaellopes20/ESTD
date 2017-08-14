package matrix;
//2- Dada uma matriz de números inteiros, retorne o menor entre eles.
public class Q2 {

	public int q2(int[][] m) {
		int menor = m[0][0];
		
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
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				if(menor > m[linha][coluna]) {
					menor = m[linha][coluna];
				}
			}
		}
		
		System.out.println("\nMENOR VALOR É: "+menor);
		return menor;
	}
}

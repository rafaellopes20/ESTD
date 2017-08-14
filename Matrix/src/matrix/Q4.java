package matrix;

/* 4- Dada uma matriz com no m�nimo duas linhas, substitua os valores
 *  da primeira linha pelos valores da segunda e vice-versa.*/
public class Q4 {

	public int[][] q4(int[][] m) {
		int matriz[][] = m.clone();
		int temp = 0;
		
		System.out.println("ENTRADA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				System.out.print("|"+ matriz[linha][coluna]);
			}
			if(linha == 0) {
				System.out.println("|<- Estes dados, devem aparecer na segunda linha ");
			}
			if(linha == 1) {
				System.out.println("|<- Estes dados, devem aparecer na primeira linha ");
			}
			if(linha > 1) {
				System.out.println("|");
			}
			
		}
		
		for (int linha = 0; linha < 1; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {
				temp = m[linha][coluna]; // variavel temporaria, recebe o valor de M[linha na posi��o do I][coluna na posi��o J]
				m[linha][coluna] = m[linha+1][coluna]; // M[linha na posi��o do I][coluna na posi��o J] recebe o valor de M[na linha seguinte][na coluna da posi��o J]
				m[linha+1][coluna] = temp;// M[na linha seguinte][na coluna da posi��o J] � igual ao valor armazenado na variavel temporaria
			}
		}
		
		System.out.println("\nSAIDA INVERTIDA");
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[0].length; coluna++) {	
				System.out.print("|"+ matriz[linha][coluna]);
			}
			if(linha == 0) {
				System.out.println("|<- Dados, da segunda linha ");
			}
			if(linha == 1) {
				System.out.println("|<- Dados, da primeira linha ");
			}
			if(linha > 1) {
				System.out.println("|");
			}
		}
		
		return matriz;
	}
}

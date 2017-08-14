package matrix;
//9- Receba uma matriz do tipo char, e conte quantas vogais essa matriz possui

public class Q9 {
	public int q9(char[][] m) {
		int contador = 0;
		char letras;

		System.out.println("ENTRADA");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print("|" + m[lin][col]);
			}
			System.out.println("|");
		}
		/*
		 * Implementação da lógica
		 */
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				if (m[lin][col] == 'A' || m[lin][col] == 'E' || m[lin][col] == 'I' || m[lin][col] == 'O'
						|| m[lin][col] == 'U' || m[lin][col] == 'a' || m[lin][col] == 'e' || m[lin][col] == 'i'
						|| m[lin][col] == 'o' || m[lin][col] == 'u') {
					contador++;
				}
			}
		}

		System.out.println("\nO Número total de vogais é: " + contador+". Segue as letras vogais encontradas:");
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[0].length; col++) {
				if (m[lin][col] == 'A' || m[lin][col] == 'E' || m[lin][col] == 'I' || m[lin][col] == 'O'
						|| m[lin][col] == 'U' || m[lin][col] == 'a' || m[lin][col] == 'e' || m[lin][col] == 'i'
						|| m[lin][col] == 'o' || m[lin][col] == 'u') {
					letras = m[lin][col];
					System.out.print(" | " + letras);
				}
			}
		}

		return contador;
	}
}

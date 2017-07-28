package matrix;

public class Pikachu {

	public static void main(String[] args) {
		char[][] matrix = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };

		print(matrix); // imprime normal
		flip(matrix); // inverte
		print(matrix); // imprimi invertido
	}
	
	public static void flip(char[][] matrix){ // inverte
		
		for (char[] line : matrix) {
			for(int column = 0; column < line.length/2; column++){
			    char temp = line[column];
			    line[column] = line[line.length - column - 1];
			    line[line.length - column - 1] = temp;
			}
		}
	}

	private static void print(char[][] matrix) { // imprime

		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.print(matrix[line][column]);
			}
			System.out.println("");
		}
	/*	Pode-se usar desta outra forma também, para imprimir
		for (char[] linha : matrix) {
			for (char celulaDaLinha : linha) {
				System.out.println(celulaDaLinha);
			}
			System.out.println();
		}*/
		
	}
}

package matrix;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int lineCount = matrix.length;
		int columnCount = matrix[0].length;

		for (int line = 0; line < lineCount; line++) {
			for (int column = 0; column < columnCount; column++) {
				System.out.print(" | " + matrix[line][column]);

			}

			System.out.println(" | "); // este fornece a quebra de linha
		}

	}

}
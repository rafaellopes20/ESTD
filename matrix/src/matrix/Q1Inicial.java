package matrix;

//Dada uma matriz de decimais (double), retorne outra matriz multiplicando cada item por 2

public class Q1Inicial {

	public double[][] q1(double matrix[][]){
		double[][] matriz = matrix.clone();
		
		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matriz[line][column] = matriz[line][column] * 2;
			}
		}
		
		return matriz;
	}
}

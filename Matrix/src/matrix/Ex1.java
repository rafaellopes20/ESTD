package matrix;
// Receba uma matrix de double e retorne outra matrix multiplicado por 2
public class Ex1 {

	public double[][] ex1(double m[][]) {
		
		double[][] matrix = m.clone();
		
		for (int line = 0; line < m.length; line++) {
			for (int column = 0; column < m[0].length; column++) {
				matrix[line][column] = matrix[line][column] * 2;
			}
		}
		
		return matrix;
	}
}

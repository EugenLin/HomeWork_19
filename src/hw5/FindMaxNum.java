package hw5;

public class FindMaxNum {

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 4 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		System.out.println("Max in int_matrix: " + maxElement(intArray));
		System.out.println("Max in double_matrix: " + maxElement(doubleArray));

	}

	public static int maxElement(int[][] matrix) {
		int x = Integer.MIN_VALUE;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > x) {
					x = matrix[i][j];
				}
			}
		}
		return x;
	}

	public static double maxElement(double[][] matrix) {
		double x = Double.MIN_VALUE;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > x) {
					x = matrix[i][j];
				}
			}
		}
		return x;
	}

}

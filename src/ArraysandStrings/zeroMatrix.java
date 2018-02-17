package ArraysandStrings;

public class zeroMatrix {

	static void setZero(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}

	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 0, 1, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 } };

		printMatrix(matrix);

		System.out.println();
		setZero(matrix);
		printMatrix(matrix);

	}

}

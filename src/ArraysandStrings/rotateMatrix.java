package ArraysandStrings;

public class rotateMatrix {

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void swap(int[][] matrix,int i,int j) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	}
	
	static void transposeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i+1; j++) {
				if(i == j) {
					continue;
				}else {
					swap(matrix, i, j);
				}
			}
		}
	}
	
	static void mirrorImage(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= matrix[i].length/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[i].length-j-1];
				matrix[i][matrix[i].length-j-1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(matrix);
		
//		System.out.println();
		transposeMatrix(matrix);
//		printMatrix(matrix);
		
		System.out.println();
		mirrorImage(matrix);
		printMatrix(matrix);

	}

}

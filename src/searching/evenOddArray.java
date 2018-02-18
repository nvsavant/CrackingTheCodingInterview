package searching;

public class evenOddArray {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		printArray(arr);

		seperatEvenOddArray(arr);
		printArray(arr);

	}

	private static void seperatEvenOddArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			// Check for first even
			while (arr[left] % 2 != 0) {
				left++;
			}
			// Check for first odd
			while (arr[right] % 2 == 0) {
				right--;
			}
			swap(arr, left, right);
		}
		swap(arr, left, right);
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

package searching;

public class linearSearch {

	static boolean isPresent(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Sorted array
//		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Unsorted array
		int[] arr = { 0, 8, 4, 6, 2, 5, 3, 7, 1, 9 };

		int key = 1;

		if (isPresent(arr, key)) {
			System.out.println("Key is present");
		} else {
			System.out.println("Key is not present");
		}

	}
}

package searching;

public class binarySearch {
	public static void main(String[] args) {
		// Sorted array
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Unsorted array
		// int[] arr = { 0, 8, 4, 6, 2, 5, 3, 7, 1, 9 };

		int key = 0;

		if (isPresent(arr, key)) {
			System.out.println("Key is present");
		} else {
			System.out.println("Key is not present");
		}

	}

	private static boolean isPresent(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		return binarySearch(arr, low, high, key);
	}

	private static boolean binarySearch(int[] arr, int low, int high, int key) {
		int mid = (low + high) / 2;
		if (low <= high) {
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] < key) {
				return binarySearch(arr, mid + 1, high, key);
			} else {
				return binarySearch(arr, low, mid - 1, key);
			}
		} else {
			return false;
		}
	}
}

package searching;

public class findMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };

		findMissingNumber(arr);
	}

	private static void findMissingNumber(int[] arr) {
		int missingValue = 0;
		for (int i = 1; i <= arr.length + 1; i++) {
			missingValue ^= i;
		}

		for (int i = 0; i < arr.length; i++) {
			missingValue ^= arr[i];
		}
		System.out.println(missingValue);
	}

}

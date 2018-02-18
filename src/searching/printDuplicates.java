package searching;

public class printDuplicates {

	static void printAllDuplicates(char[] arr) {
		int[] bucketSort = new int[26];

		for (int i = 0; i < arr.length; i++) {
			bucketSort[arr[i] - 'a']++;
		}
		for (int j = 0; j < bucketSort.length; j++) {
			if (bucketSort[j] > 1) {
				System.out.println((char) (j + 'a'));
			}
		}
	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'b', 'd', 'z', 'z', 'g', 'h', 'j', 'k', 'l' };
		
		printAllDuplicates(arr);

	}

}

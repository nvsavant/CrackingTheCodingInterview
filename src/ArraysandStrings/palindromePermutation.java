package ArraysandStrings;

public class palindromePermutation {

	static boolean isPalindromePermutation(String str) {
		char[] tmpArray = str.toCharArray();

		int[] bucketSort = new int[26];
		for (int i = 0; i < tmpArray.length; i++) {
			bucketSort[tmpArray[i] - 'a']++;
		}

		int numberOfSingleElements = 0;
		for (int i = 0; i < bucketSort.length; i++) {
			if (bucketSort[i] % 2 == 1) {
				numberOfSingleElements++;
			}
		}

		if (numberOfSingleElements > 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		if (isPalindromePermutation("tactcoa")) {
			System.out.println("Palindrome Permutation");
		} else {
			System.out.println("Not a Palindrome Permutation");
		}
	}
}

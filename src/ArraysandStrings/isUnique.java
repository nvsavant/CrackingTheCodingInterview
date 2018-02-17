package ArraysandStrings;

public class isUnique {

	static boolean isUniqueElements(char[] arr) {
		char[] bucketSort = new char[26];
		for (int i = 0; i < arr.length; i++) {
			if (bucketSort[arr[i] - 'a'] == 0)
				bucketSort[arr[i] - 'a']++;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'a', 'g', 'h', 'j', 'k', 'l' };

		if (isUniqueElements(arr)) {
			System.out.println("Unique");
		} else {
			System.out.println("Not Unique");
		}

	}
}

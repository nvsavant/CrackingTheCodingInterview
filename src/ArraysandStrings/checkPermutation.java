package ArraysandStrings;

import java.util.Arrays;

public class checkPermutation {

	static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();

		Arrays.sort(strArray1);
		Arrays.sort(strArray2);

		for (int i = 0; i < strArray1.length; i++) {
			if (strArray1[i] != strArray2[i]) {
				return false;
			} else {
				continue;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		if (isPermutation("bacd", "dcab")) {
			System.out.println("Permutation");
		} else {
			System.out.println("Not Permutation");
		}

	}

}

package ArraysandStrings;

import java.util.Arrays;

public class oneEditAway {

	static boolean isOneAway(String str1, String str2) {
		if ((int) Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		int[] bucketSort1 = new int[26];
		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i]);
			bucketSort1[array1[i] - 'a']++;
		}

		int[] bucketSort2 = new int[26];
		for (int i = 0; i < array2.length; i++) {
//			System.out.print(array2[i]);
			bucketSort2[array2[i] - 'a']++;
		}

		int numberOfChanges = 0;
		for (int i = 0; i < bucketSort1.length; i++) {
			if (bucketSort1[i] == bucketSort2[i]) {
				continue;
			} else {
				numberOfChanges++;
			}
		}
//		System.out.println(numberOfChanges);

		if (numberOfChanges > 2) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(isOneAway("pale", "ple"));
		System.out.println(isOneAway("pales", "pale"));
		System.out.println(isOneAway("pale", "bale"));
		System.out.println(isOneAway("pale", "bake"));

	}

}

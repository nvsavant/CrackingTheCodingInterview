package searching;

import java.util.Hashtable;

public class findPair {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1 };

		int value = 11;

		if (isPairPresent(arr, value)) {
			System.out.println("Pair present");
		} else {
			System.out.println("Pair not present");
		}

	}

	static boolean isPairPresent(int[] arr, int value) {
		Hashtable<Integer, Integer> hmap = new Hashtable<>();
		
		for(int i =0;i<arr.length;i++) {
			int diff = value - arr[i];
			if(hmap.contains(diff)) {
				return true;
			}else {
				hmap.put(arr[i], 1);
			}
		}
		return false;
	}

}

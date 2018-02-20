package hashTables;

import java.util.HashMap;
import java.util.Hashtable;

public class areAnagrams {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] sBucket = new int[256];
		int[] tBucket = new int[256];

		for (int i = 0; i < s.length(); i++) {
			sBucket[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			tBucket[t.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 256; i++) {
			if (sBucket[i] == tBucket[i]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

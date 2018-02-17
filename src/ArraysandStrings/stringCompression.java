package ArraysandStrings;

public class stringCompression {
	static void stringCompress(String str) {
		System.out.println("Original string:" + str);

		char[] tmpArray = str.toCharArray();
		StringBuilder newStr = new StringBuilder();
		int localCount = 1;
		char ch = tmpArray[0];
		for (int i = 1; i < tmpArray.length; i++) {
			if (ch != tmpArray[i]) {
				newStr.append(ch);
				newStr.append(localCount);
				localCount = 1;
				ch = tmpArray[i];
			} else {
				localCount++;
			}
		}
		newStr.append(ch);
		newStr.append(localCount);
		System.out.println("Original string:" + newStr);
	}

	public static void main(String[] args) {
		stringCompress("aabcccccaaa");

	}

}

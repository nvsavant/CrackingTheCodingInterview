package ArraysandStrings;

public class reverseArray {
	// Start--0 to End--(length - 1)
	static void reverseString(char[] tempStr, int start, int end) {
		int j = end;
		for (int i = start; i < j; i++, j--) {
			char temp = tempStr[i];
			tempStr[i] = tempStr[j];
			tempStr[j] = temp;
		}
	}

	static void reverseChunks(char[] tempStr, char delimiter) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < tempStr.length; i++) {
			if (tempStr[i] != delimiter) {
				end = i;
				continue;
			} else {
				reverseString(tempStr, start, end);
				start = i + 1;
			}

		}
		reverseString(tempStr, start, end);
	}

	static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "LG is good";
		char[] origArray = str.toCharArray();
		printArray(origArray);

		System.out.println();
		reverseString(origArray, 0, origArray.length - 1);
		reverseChunks(origArray, ' ');

		printArray(origArray);
	}

}

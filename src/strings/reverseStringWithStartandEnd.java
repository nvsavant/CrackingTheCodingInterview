package strings;

public class reverseStringWithStartandEnd {

	static void reverseFunction(char[] strArray, int start, int end) {
		for (int i = start, j = end; i <= j; i++, j--) {
			 swap(strArray, i, j);
//			strArray[i] ^= strArray[j] ^= strArray[i] ^= strArray[j];
		}
	}

	private static void swap(char[] strArray, int i, int j) {
		char temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;

	}

	public static void main(String[] args) {
		String str = "LG is good";
		char[] strArray = str.toCharArray();

		System.out.println(strArray);

		reverseFunction(strArray, 0, strArray.length-1);

		int start = 0;
		int end = 0;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] == ' ' || strArray[i] == '\0') {
				reverseFunction(strArray, start, end);
				start = i+1;
			}else {
				end = i;
				
			}
		}
		reverseFunction(strArray, start, end);

		System.out.println(strArray);

	}

}

package ArraysandStrings;

public class URLify {

	static void urlIFY(String str, int size) {
		System.out.println("Input string:" + str);

		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (str.charAt(i) == ' ') {
				newStr.append("%20");
			} else {
				newStr.append(str.charAt(i));
			}
		}

		System.out.println("Output string:" + newStr);

	}

	public static void main(String[] args) {
		String str = "Mr John Smith ";
		urlIFY(str, 13);
	}

}

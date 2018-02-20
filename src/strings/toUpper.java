package strings;

public class toUpper {

	static String convertToUpper(String str) {
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = (char) (strArray[i] - 'a' + 'A');
		}
		
		return String.valueOf(strArray);
	}

	public static void main(String[] args) {

		String input = "abcdefghijklmnopqrstuvwxyz";

		System.out.println(input);

		System.out.println(convertToUpper(input));

	}

}

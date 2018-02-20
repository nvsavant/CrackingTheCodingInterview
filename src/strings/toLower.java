package strings;

public class toLower {
	public static void main(String[] args) {

		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.println(input);

		System.out.println(convertToLower(input));

	}

	private static String convertToLower(String str) {
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = (char) (strArray[i] - 'A' + 'a');
		}
		
		return String.valueOf(strArray);
	}
}

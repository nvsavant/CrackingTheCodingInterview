package ArraysandStrings;

public class stringRotate {

	static boolean isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		StringBuilder str = new StringBuilder();
		str.append(str2);
		str.append(str2);

		return str.toString().contains(str1);

	}

	public static void main(String[] args) {
		if (isRotation("waterbottle", "erbottlewat")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}

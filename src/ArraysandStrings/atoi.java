package ArraysandStrings;

public class atoi {

	static int Atoi(String str) {
		char[] tmpStr = str.toCharArray();
		int number = 0;
		int sign = 1;
		for (int i = 0; i < tmpStr.length; i++) {
			if (tmpStr[i] == '-') {
				sign = -1;
				continue;
			}
			if (tmpStr[i] >= '0' && tmpStr[i] <= '9') {
				number = number * 10;
				number += (int) (tmpStr[i] - '0');
			} else {
				return 0;
			}
		}
		return (sign * number);
	}

	public static void main(String[] args) {

		System.out.println(Atoi("1234"));
		System.out.println(Atoi("23456"));
		System.out.println(Atoi("-234"));

	}

}

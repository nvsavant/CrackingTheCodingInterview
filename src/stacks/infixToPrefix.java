package stacks;

import java.util.Stack;

public class infixToPrefix {

	static int precedence(char x) {
		if(x == '(')
			return 0;
		if (x == '+' || x == '-')
			return (1);
		if (x == '*' || x == '/' || x == '%')
			return (2);
		if (x == '^')
			return (3);
		return (4);
	}

	static boolean isOperand(char x) {
		if (x >= 'A' && x <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String str = "A*B+C";

		infixToPrefixExpression(str);

	}

	private static void infixToPrefixExpression(String str) {
		char[] strArray = str.toCharArray();
		Stack<Character> stack = new Stack<>();

		StringBuilder newStr = new StringBuilder();
		for (int i = strArray.length-1; i >=0; i--) {
			if (isOperand(strArray[i])) {
				newStr.append(strArray[i]);
				continue;
			} else {
				if (stack.isEmpty()) {
					stack.push(strArray[i]);
					continue;
				} else if (precedence(stack.peek()) < precedence(strArray[i])) {
					stack.push(strArray[i]);
					continue;
				} else {
					while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(strArray[i])) {
						newStr.append(stack.pop());
					}
					stack.push(strArray[i]);
				}
			}
		}
		while (stack.isEmpty() == false) {
			newStr.append(stack.pop());
		}
		System.out.println(newStr.reverse());

	}

}

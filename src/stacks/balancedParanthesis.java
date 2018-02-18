package stacks;

import java.util.*;

public class balancedParanthesis {

	public static void main(String[] args) {
		String str = "{((} and {(})";

		System.out.println(isBalancedParanthesis(str));

	}

	private static boolean isBalancedParanthesis(String str) {
		char[] strArray = str.toCharArray();

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < strArray.length; i++) {
			switch (strArray[i]) {
			case '(':
				stack.push(strArray[i]);
				break;
			case '{':
				stack.push(strArray[i]);
				break;
			case '[':
				stack.push(strArray[i]);
				break;
			case ')':
				if (stack.pop() == '(')
					continue;
				else
					return false;
			case '}':
				if (stack.pop() == '{') 
					continue;
				else
					return false;
			case ']':
				if (stack.pop() == '[')
					continue;
				else
					return false;
			default:
				return false;

			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;

	}

}

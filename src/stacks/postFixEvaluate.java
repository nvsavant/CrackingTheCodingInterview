package stacks;

import java.util.Stack;

public class postFixEvaluate {

	public static void main(String[] args) {
		String str = "5*7+3";

		String newStr = infixToPostfixExpression(str);
//		System.out.println(newStr);

		postFixEvaluation(newStr);

	}

	static int evaluateExpression(Integer op1, Integer op2, char operator) {
		int returnValue = 0;
		switch (operator) {
		case '+':
			returnValue = op1 + op2;
			break;
		case '-':
			returnValue = op1 - op2;
			break;
		case '*':
			returnValue = op1 * op2;
			break;
		case '/':
			returnValue = op1 / op2;
			break;
		case '%':
			returnValue = op1 % op2;
			break;
		}
		return returnValue;
	}

	private static void postFixEvaluation(String newStr) {
		char[] strArray = newStr.toCharArray();
		Stack<Integer> stack = new Stack<>();
		int expressionEvaluation = 0;

		for (int i = 0; i < strArray.length; i++) {
			if (isOperand(strArray[i])) {
				stack.push(Character.getNumericValue(strArray[i]));
			} else {
				Integer op1 = stack.pop();
				Integer op2 = stack.pop();
				expressionEvaluation = evaluateExpression(op1, op2, strArray[i]);
				stack.push(expressionEvaluation);
			}
		}
		System.out.println(stack.pop());
	}

	private static String infixToPostfixExpression(String str) {
		char[] strArray = str.toCharArray();
		Stack<Character> stack = new Stack<>();

		StringBuilder newStr = new StringBuilder();
		for (int i = strArray.length - 1; i >= 0; i--) {
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
		// System.out.println(newStr);
		return newStr.toString();
	}

	static int precedence(char x) {
		if (x == '(')
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
		if (x >= '0' && x <= '9') {
			return true;
		} else {
			return false;
		}
	}

}

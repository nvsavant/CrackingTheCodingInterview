package stacks;

import java.util.*;

public class reverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		printStack(stack);

		reverseTheStack(stack);
		printStack(stack);

	}

	private static void reverseTheStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int data = stack.pop();
		reverseTheStack(stack);
		insertAtBottom(stack, data);
	}

	private static void insertAtBottom(Stack<Integer> stack, int data) {
		if (stack.isEmpty()) {
			stack.push(data);
		} else {
			int temp = stack.pop();
			insertAtBottom(stack, data);
			stack.push(temp);
		}

	}

	private static void printStack(Stack<Integer> stack) {
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}

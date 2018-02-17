package stacks;

import java.util.Stack;

public class sortStack {
	
	static Stack<Integer> mainStack;
	static Stack<Integer> tempStack;
	
	public sortStack() {
		this.mainStack = new Stack<>();
		this.tempStack = new Stack<>();
	}
	
	private void push(int data) {
		if(mainStack.isEmpty()) {
			mainStack.push(data);
			return;
		}
		
		while(mainStack.isEmpty() == false && mainStack.peek() < data) {
			tempStack.add(mainStack.pop());
		}
		
		mainStack.add(data);
		
		while(tempStack.isEmpty() == false) {
			mainStack.push(tempStack.pop());
		}
	}
	
	private int pop() {
		return mainStack.pop();
	}
	

	public static void main(String[] args) {
		sortStack s = new sortStack();
		
		s.push(7);
		s.push(8);
		s.push(4);
		s.push(5);
		s.push(3);
		s.push(1);
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}

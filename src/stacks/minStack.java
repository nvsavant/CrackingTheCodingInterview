package stacks;

public class minStack {
	private stack mainStack = new stack();
	private stack minStack = new stack();

	void push(int data) {
		mainStack.push(data);

		if (minStack.isEmpty() == true) {
			minStack.push(data);
		} else {
			if (minStack.peek() >= data) {
				minStack.push(data);
			} else {
				// Do Nothing
			}
		}
	}

	int pop() {
		int returnValue = mainStack.pop();
		if (minStack.isEmpty() == true) {
			// Do nothing
		} else {
			if (minStack.peek() == returnValue) {
				minStack.pop();
			} else {
				// Do Nothing
			}
		}
		return returnValue;
	}

	int min() {
		if (minStack.isEmpty() == true) {
			return -1;
		} else {
			return minStack.peek();
		}
	}

	public void print() {
		mainStack.print();
	}

}

package stacks;

public class maxStack {
	private stack mainStack = new stack();
	private stack maxStack = new stack();

	void push(int data) {
		mainStack.push(data);

		if (maxStack.isEmpty() == true) {
			maxStack.push(data);
		} else {
			if (maxStack.peek() <= data) {
				maxStack.push(data);
			} else {
				// Do Nothing
			}
		}
	}

	int pop() {
		int returnValue = mainStack.pop();
		if (maxStack.isEmpty() == true) {
			// Do nothing
		} else {
			if (maxStack.peek() == returnValue) {
				maxStack.pop();
			} else {
				// Do Nothing
			}
		}
		return returnValue;
	}

	int max() {
		if (maxStack.isEmpty() == true) {
			return -1;
		} else {
			return maxStack.peek();
		}
	}

	public void print() {
		mainStack.print();
	}

}

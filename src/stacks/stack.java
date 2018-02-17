package stacks;

public class stack {
	private Node headRef = null;

	public stack() {
		// TODO Auto-generated constructor stub
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (this.isEmpty() == true) {
			headRef = newNode;
			return;
		}
		newNode.setNext(headRef);
		headRef = newNode;
	}

	public int pop() {
		if (this.isEmpty() == true) {
			return -1;
		}
		Node tempNode = headRef;
		int returnValue = tempNode.getData();
		headRef = tempNode.getNext();
		return returnValue;
	}

	public int peek() {
		if (this.isEmpty() == true) {
			return -1;
		}
		return this.headRef.getData();
	}

	public boolean isEmpty() {
		return this.headRef == null;
	}

	public void print() {
		if (this.isEmpty() == true) {
			System.out.println("Stack is empty");
			return;
		}
		Node tempNode = headRef;
		while (tempNode != null) {
			System.out.print(tempNode.getData()+"-->");
			tempNode = tempNode.getNext();
		}
		System.out.println("null");
	}

}

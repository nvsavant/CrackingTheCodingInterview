package LinkedList;

public class linkedList {
	private Node headRef;

	public linkedList() {
		this.headRef = null;
	}

	void appendToTail(int data) {
		Node newNode = new Node(data);
		if (this.isEmpty() == true) {
			headRef = newNode;
			return;
		}
		Node tempNode = headRef;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(newNode);
	}

	void deleteNode(int data) {
		if (this.isEmpty() == true) {
			System.out.println("List is Empty!!!");
			return;
		}
		if(headRef.getData() == data) {
			headRef = headRef.getNext();
			return;
		}
		
		Node tempNode = headRef.getNext();
		Node oldNode = headRef;
		while (tempNode != null) {
			if(tempNode.getData() == data) {
				oldNode.setNext(tempNode.getNext());
				return;
			}
			oldNode = tempNode;
			tempNode = tempNode.getNext();
		}
	}

	void print() {
		if (this.isEmpty() == true) {
			System.out.println("List is Empty!!!");
			return;
		}
		Node tempNode = headRef;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + "-->");
			tempNode = tempNode.getNext();
		}
		System.out.println("null");
	}

	public boolean isEmpty() {
		return this.headRef == null;
	}
}

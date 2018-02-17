package queues;

import stacks.Node;

public class queue {
	private Node headRef;
	
	public queue() {
		this.headRef = null;
	}
	
	public void enQueue(int data) {
		Node newNode = new Node(data);
		if(this.isEmpty()) {
			headRef = newNode;
			return;
		}
		Node tempNode = headRef;
		while(tempNode.getNext()!=null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(newNode);
	}
	
	public int deQueue() {
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int returnValue;
		if(headRef.getNext() == null) {
			returnValue = headRef.getData();
			headRef = null;
			return returnValue;
		}
		returnValue = headRef.getData();
		headRef = headRef.getNext();
		return returnValue;
	}
	
	public boolean isEmpty() {
		return this.headRef == null;
	}
	public void print() {
		if (this.isEmpty() == true) {
			System.out.println("Queue is empty");
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

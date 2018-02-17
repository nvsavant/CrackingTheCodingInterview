package LinkedList;

public class App {

	public static void main(String[] args) {
		linkedList ll = new linkedList();
		
		ll.appendToTail(1);
		ll.appendToTail(2);
		ll.appendToTail(3);
		ll.appendToTail(4);
		
		ll.deleteNode(1);
		ll.deleteNode(2);
		ll.deleteNode(4);
		ll.deleteNode(3);
		
		
		ll.print();

	}

}

package bst;

public class App {

	public static void main(String[] args) {
		binarySearchTree bst = new binarySearchTree();
		
		bst.add(4);
		bst.add(2);
		bst.add(6);
		bst.add(1);
		bst.add(3);
		bst.add(5);
		bst.add(7);
		
		bst.inOrderTraversal();
		bst.preOrderTraversal();
		bst.postOrderTraversal();
		
	}
}

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
		bst.add(0);
		bst.add(100);

		// bst.inOrderTraversal();
		// bst.preOrderTraversal();
		// bst.postOrderTraversal();

		// bst.breadthFirstTraversal();

//		System.out.println(bst.treeDepth());
		
//		System.out.println(bst.numberOfNodes());
		
//		System.out.println(bst.numberOfLeafNodes());
		
//		System.out.println("Maximum:"+bst.max());
//		System.out.println("Minimum:"+bst.min());
		
		
//		System.out.println(bst.numberOfFullNodes());
		System.out.println(bst.isBST());
		

	}
}

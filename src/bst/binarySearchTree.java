package bst;

public class binarySearchTree {
	private Node root;

	public binarySearchTree() {
		this.root = null;
	}

	public void add(int data) {
		if (this.root == null) {
			Node newNode = new Node(data);
			this.root = newNode;
			return;
		}
		addNode(root, data);
	}

	private Node addNode(Node node, int data) {
		if (node == null) {
			Node newNode = new Node(data);
			return newNode;
		}
		if (node.getData() < data) {
			node.setRightChild(addNode(node.getRightChild(), data));
			return node;
		} else {
			node.setLeftChild(addNode(node.getLeftChild(), data));
			return node;
		}
	}

	public void inOrderTraversal() {
		if (this.root == null) {
			System.out.println("BST is empty");
			return;
		}
		inOrderTraversalNode(this.root);
		System.out.println();
	}

	private void inOrderTraversalNode(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraversalNode(node.getLeftChild());
		System.out.print(node.getData() + " ");
		inOrderTraversalNode(node.getRightChild());
	}

	public void preOrderTraversal() {
		if (this.root == null) {
			System.out.println("BST is empty");
			return;
		}
		preOrderTraversalNode(this.root);
		System.out.println();
	}

	private void preOrderTraversalNode(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + " ");
		preOrderTraversalNode(node.getLeftChild());
		preOrderTraversalNode(node.getRightChild());
	}

	public void postOrderTraversal() {
		if (this.root == null) {
			System.out.println("BST is empty");
			return;
		}
		postOrderTraversalNode(this.root);
		System.out.println();
	}

	private void postOrderTraversalNode(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraversalNode(node.getLeftChild());
		postOrderTraversalNode(node.getRightChild());
		System.out.print(node.getData() + " ");
	}

}

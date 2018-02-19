package bst;

import java.util.LinkedList;
import java.util.Queue;

public class binarySearchTree {
	private Node root;
	private Node prev;

	public binarySearchTree() {
		this.root = null;
		this.setPrev(null);
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

	public void breadthFirstTraversal() {
		if (this.root == null) {
			System.out.println("BST is empty");
			return;
		}

		Queue<Node> queue = new LinkedList<Node>();
		Node tempNode = this.root;

		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			if (tempNode.getLeftChild() != null) {
				queue.add(tempNode.getLeftChild());
			}

			if (tempNode.getRightChild() != null) {
				queue.add(tempNode.getRightChild());
			}

			tempNode = queue.poll();
		}
		System.out.println();
	}

	public int treeDepth() {
		if (this.root == null) {
			System.out.println("BST is empty");
			return 0;
		}
		return treeDepthNode(this.root);
	}

	private int treeDepthNode(Node node) {
		if (node == null) {
			return 0;
		}
		int leftCount = treeDepthNode(node.getLeftChild());
		int rightCount = treeDepthNode(node.getRightChild());

		return (int) Math.max(leftCount, rightCount) + 1;
	}

	public int numberOfNodes() {
		if (this.root == null) {
			return 0;
		}
		return numberOfNodesNode(this.root);
	}

	private int numberOfNodesNode(Node node) {
		if (node == null) {
			return 0;
		}
		int leftCount = numberOfNodesNode(node.getLeftChild());
		int rightCount = numberOfNodesNode(node.getRightChild());
		return leftCount + rightCount + 1;
	}

	public int max() {
		if (this.root == null) {
			return -1;
		}
		return maxNode(this.root);
	}

	private int maxNode(Node node) {
		if (node.getRightChild() == null) {
			return node.getData();
		}
		return maxNode(node.getRightChild());
	}

	public int min() {
		if (this.root == null) {
			return -1;
		}
		return minNode(this.root);
	}

	private int minNode(Node node) {
		if (node.getLeftChild() == null) {
			return node.getData();
		}
		return minNode(node.getLeftChild());
	}

	public int numberOfFullNodes() {
		if (this.root == null) {
			return 0;
		}
		return numberOfFullNodesNode(this.root);
	}

	private int numberOfFullNodesNode(Node node) {
		if (node.getLeftChild() == null || node.getRightChild() == null) {
			return 0;
		} else {
			int leftCount = numberOfNodesNode(node.getLeftChild());
			int rightCount = numberOfNodesNode(node.getRightChild());
			return leftCount + rightCount;
		}

	}

	public int numberOfLeafNodes() {
		if (this.root == null) {
			return 0;
		}
		return numberOfLeafNodesNode(this.root);
	}

	private int numberOfLeafNodesNode(Node node) {
		if (node.getLeftChild() == null && node.getRightChild() == null) {
			return 1;
		} else {
			return numberOfLeafNodesNode(node.getLeftChild()) + numberOfLeafNodesNode(node.getRightChild());
		}

	}

	public boolean isBST() {
		this.prev = null;
		if (isBSTUtil(this.root) == false) {
			return false;
		} else {
			return true;
		}
	}

	private boolean isBSTUtil(Node node) {
		if(node != null) {
			if(!isBSTUtil(node.getLeftChild()))
				return false;
			
			if(this.prev!=null && this.prev.getData()>=node.getData()) {
				return false;
			}
			prev = node;
			return isBSTUtil(node.getRightChild());
		}
		return true;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}

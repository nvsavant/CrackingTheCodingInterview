package heaps;

public class Heap {
	private Integer[] heap;
	private int currentIndex = -1;

	public Heap(int size) {
		this.heap = new Integer[size];
	}

	public void insert(int data) {
		if (isFull()) {
			throw new RuntimeException("Heap is full");
		}
		this.currentIndex++;
		this.heap[this.currentIndex] = data;
		fixUp(this.currentIndex);
	}

	public int getMax() {
		if (isEmpty()) {
			throw new RuntimeException("Heap is empty");
		}
		int result = this.heap[0];
		this.currentIndex--;

		this.heap[0] = this.heap[currentIndex + 1];
		this.heap[currentIndex + 1] = null;
		fixDown(0, -1);

		return result;
	}

	private void fixDown(int index, int upto) {
		if (upto < 0) {
			upto = this.currentIndex;
		}
		while (index <= upto) {
			int leftChildIndex = 2 * index + 1;
			int rightChildIndex = 2 * index + 2;
			if (leftChildIndex <= upto) {
				int childToReplace;
				if (rightChildIndex > upto) {
					childToReplace = leftChildIndex;
				} else {
					childToReplace = (heap[leftChildIndex] > heap[rightChildIndex]) ? leftChildIndex : rightChildIndex;
				}
				if (heap[index] < heap[childToReplace]) {
					swap(heap, index, childToReplace);
					index = childToReplace;
				} else {
					break;
				}
			} else {
				break;
			}
		}

	}

	public void heapSort() {
		for (int i = 0; i <= currentIndex; i++) {
			int temp = heap[0];
			System.out.print(temp + " ");
			heap[0] = heap[currentIndex - i];
			heap[currentIndex - i] = temp;
			fixDown(0, currentIndex - i - 1);
		}
		System.out.println();
	}

	private boolean isEmpty() {
		return this.currentIndex == -1;
	}

	private void fixUp(int index) {
		int parentIndex = (index - 1) / 2;
		while (parentIndex >= 0 && heap[parentIndex] < heap[index]) {
			swap(heap, index, parentIndex);
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}

	}

	private void swap(Integer[] heap, int index, int parentIndex) {
		int temp = heap[index];
		heap[index] = heap[parentIndex];
		heap[parentIndex] = temp;
	}

	private boolean isFull() {
		return this.currentIndex == this.heap.length;
	}

	public int printKthMax(int k) {
		int returnValue = -1;
		for (int i = 0; i <= currentIndex; i++) {
			int temp = heap[0];
			System.out.print(temp + " ");
			heap[0] = heap[currentIndex - i];
			heap[currentIndex - i] = temp;
			fixDown(0, currentIndex - i - 1);
		}
		return returnValue;
	}

}

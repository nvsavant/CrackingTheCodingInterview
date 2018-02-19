package heaps;

public class App {
	public static void main(String[] args) {
		Heap h = new Heap(10);
		
		h.insert(100);
		h.insert(30);
		h.insert(90);
		h.insert(40);
		h.insert(-70);
		h.insert(60);
		h.insert(-20);
		
		h.heapSort();
		

	}
}

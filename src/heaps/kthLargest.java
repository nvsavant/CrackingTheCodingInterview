package heaps;

import java.util.Scanner;

public class kthLargest {
	public static void main(String[] args) {
		Heap h = new Heap(10);
		
		h.insert(4);
		h.insert(2);
		h.insert(6);
		h.insert(1);
		h.insert(3);
		h.insert(5);
		h.insert(7);
		
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		

		System.out.println(h.printKthMax(k));
		
		scan.close();
	}
}

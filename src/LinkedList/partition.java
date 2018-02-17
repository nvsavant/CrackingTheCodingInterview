package LinkedList;

import java.util.*;

public class partition {

	static void partitionLL(List<Integer> ll, int x) {
		LinkedList<Integer> smaller = new LinkedList<>();
		LinkedList<Integer> greater = new LinkedList<>();
		


		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i) < x) {
				smaller.add(ll.get(i));
			} else {
				greater.add(ll.get(i));
			}
		}
		for(int i=0;i<greater.size();i++) {
			smaller.add(greater.get(i));
		}
		
		print(smaller);
	}

	static void print(List<Integer> ll) {
		if (ll.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		for (Integer item : ll) {
			System.out.print(item + " --> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();

		ll.add(3);
		ll.add(5);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		ll.add(2);
		ll.add(1);

		print(ll);

		partitionLL(ll, 5);

	}

}

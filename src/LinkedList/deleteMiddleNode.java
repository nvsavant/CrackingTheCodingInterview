package LinkedList;

import java.util.*;

public class deleteMiddleNode {

	static void deleteMiddleOne(List<Character> ll) {
		ll.remove((ll.size() / 2) - 1);
	}

	static void print(List<Character> ll) {
		if (ll.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		for (Character item : ll) {
			System.out.print(item + " --> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		List<Character> ll = new LinkedList<>();

		ll.add('a');
		ll.add('b');
		ll.add('c');
		ll.add('d');
		ll.add('e');
		ll.add('f');

		print(ll);

		deleteMiddleOne(ll);

		print(ll);
	}

}

package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class returnKthToLast {
	// Non-recursive
	// static void printKthToLast(List<Integer> ll, int k) {
	// int index = ll.size() - k;
	// System.out.println(ll.get(index));
	// }

	//Recursive
	static void printKthToLast(List<Integer> ll, int k) {
		if (k > ll.size()) {
			System.out.println("No element present");
			return;
		}else if(k == 0) {
			System.out.println("Please enter valid k");
			return;
		}
		
		
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ll.size(); i++) {
			s.push(ll.get(i));
		}

		for (int j = 0; j < k - 1; j++) {
			s.pop();
		}
		System.out.println(s.pop());

	}

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();

		ll.add(20);
		ll.add(4);
		ll.add(15);
		ll.add(35);

		printKthToLast(ll, 0);

	}

}

package LinkedList;

import java.util.*;

public class sumLists {
	
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
	
	static void sumOfLists(List<Integer> ll1, List<Integer> ll2) {
		int carry = 0;
		List<Integer> ll = new LinkedList<Integer>();
		for(int i=0;i<ll1.size();i++) {
			int sum = ll1.get(i)+ll2.get(i)+carry;
			ll.add(sum % 10);
			carry = sum /10;
		}
		if(carry > 0) {
			ll.add(carry);
		}
		print(ll);
		
	}

	public static void main(String[] args) {
		List<Integer> ll1 = new LinkedList<Integer>();
		List<Integer> ll2 = new LinkedList<Integer>();
		
		ll1.add(7);
		ll1.add(1);
		ll1.add(6);
//		print(ll1);
		
		
		ll2.add(5);
		ll2.add(9);
		ll2.add(2);
		
		sumOfLists(ll1, ll2);

	}

}

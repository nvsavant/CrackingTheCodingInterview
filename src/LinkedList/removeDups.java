package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class removeDups {

	// O(N*N)
	// static void removeDuplicates(List<Integer> ll) {
	// for(int i=0;i<ll.size();i++) {
	// for(int j=i+1;j<ll.size();j++) {
	// if(ll.get(i)==ll.get(j)) {
	// ll.remove(j);
	// j--;
	// }
	// }
	// }
	// }

	//O(N)
	static void removeDuplicates(List<Integer> ll) {
		HashSet<Integer> hset = new HashSet<>();
		for (int i = 0; i < ll.size(); i++) {
			if(hset.contains(ll.get(i)) == false) {
				hset.add(ll.get(i));
			}else {
				ll.remove(i);
				i--;
			}
		}
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
		List<Integer> ll = new LinkedList<>();

		ll.add(12);
		ll.add(23);
		ll.add(1);
		ll.add(2);
		ll.add(23);
		ll.add(2);
		ll.add(21);

		print(ll);

		removeDuplicates(ll);

		print(ll);

	}

}

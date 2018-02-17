package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class detectLoop {

	static boolean isLoop(List<Character> ll) {
		int j = 0;
		for (int i = 0; i < ll.size(); i++, j = j + 2) {
			if (ll.get(i) == ll.get(j))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		List<Character> ll = new LinkedList<Character>();

		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('F');

		if (isLoop(ll)) {
			System.out.println("Loop detected");
		} else {
			System.out.println("Loop not detected");
		}

	}

}

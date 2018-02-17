package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class palindrome {

	static boolean isPalindrome(List<Integer> ll) {
		int i = 0;
		int j = ll.size()-1;
		while(i<=j) {
			if(ll.get(i) != ll.get(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		
		
		ll.add(1);
		ll.add(21);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		
		if(isPalindrome(ll)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}

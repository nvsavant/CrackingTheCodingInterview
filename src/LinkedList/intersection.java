package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class intersection {

	static boolean isInterstion(List<Integer> ll1,List<Integer> ll2) {
		int len1 = ll1.size();
		int len2 = ll2.size();
		
		int diff = (int)Math.abs(len1-len2);
		if(len1>len2) {
			for(int i=0;i<len2;i++) {
				if(ll1.get(i+diff) == ll2.get(i))
					return true;
			}
		}else {
			for(int i=0;i<len1;i++) {
				if(ll2.get(i+diff) == ll1.get(i))
					return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		List<Integer> ll1 = new LinkedList<Integer>();
		List<Integer> ll2 = new LinkedList<Integer>();
		
		ll1.add(3);
		ll1.add(1);
		ll1.add(5);
		ll1.add(9);
		ll1.add(1);
		ll1.add(1);
		ll1.add(10);
		
		ll2.add(4);
		ll2.add(6);
		ll2.add(7);
		ll2.add(2);
		ll2.add(1);
		
		if(isInterstion(ll1,ll2)) {
			System.out.println("Intersection");
		}else {
			System.out.println("No intersetion");
		}

	}

}

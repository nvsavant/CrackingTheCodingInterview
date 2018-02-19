package stacks;

import java.util.*;

public class stockSpanProblem {

	public static void main(String[] args) {
		int price[] = { 6, 2, 5, 4, 5, 1, 6 };
		int n = price.length;
		int spanArray[] = new int[n];

		// Fill the span values in array S[]
		calculateSpan(price, n, spanArray);

		// print the calculated span values
		printArray(spanArray);

	}
	
	
	//O(N*N)
//	private static void calculateSpan(int[] price, int n, int[] spanArray) {
//		spanArray[0] = 1;
//
//		for (int i = 1; i < spanArray.length; i++) {
//			spanArray[i] = 1;
//			for (int j = i - 1; j >= 0; j--) {
//				if (price[i] >= price[j]) {
//					spanArray[i]++;
//					continue;
//				} else {
//					break;
//				}
//			}
//		}
//	}
	
	//O(N)
	private static void calculateSpan(int[] price, int n, int[] spanArray) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		spanArray[0]=1;
		for(int i=1;i<price.length;i++) {
			while(!stack.isEmpty() && price[i]>=price[stack.peek()]) {
				stack.pop();
			}
			
			spanArray[i] = stack.isEmpty()?i+1:i-stack.peek();
			stack.push(i);
		}
	}


	private static void printArray(int[] spanArray) {
		for (int i = 0; i < spanArray.length; i++) {
			System.out.print(spanArray[i] + " ");
		}
		System.out.println();
	}

}

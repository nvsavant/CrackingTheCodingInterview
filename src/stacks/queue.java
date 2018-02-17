package stacks;

import java.util.Stack;

public class queue {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public queue() {
		this.s1 = new Stack<>();
		this.s2 = new Stack<>();
	}

	void enQueue(int data) {
		s1.push(data);
	}

	int deQueue() {
		int returnValue = -1;
		if (s2.isEmpty() && s1.isEmpty()) {
			returnValue = -1;
		} else if (s2.isEmpty() && s1.isEmpty() == false) {
			while (s1.isEmpty() == false) {
				s2.push(s1.pop());
			}
			returnValue = s2.pop();
		} else if (s2.isEmpty() == false) {
			returnValue = s2.pop();
		}
		return returnValue;
	}

	public static void main(String[] args) {
		queue q = new queue();
		
		System.out.println(q.deQueue());
		
		
		q.enQueue(1);
		
		System.out.println(q.deQueue());
		
		
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

}

package stacks;

public class App {

	public static void main(String[] args) {
		minStack s = new minStack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(3);
		s.push(1);

//		s.pop();
//		s.pop();
		
		System.out.println("Minimum element is " + s.min());

//		s.print();

	}

}

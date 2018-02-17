package stacks;

public class App {

	public static void main(String[] args) {
		maxStack s = new maxStack();
//		s.push(4);
		s.push(3);
		s.push(2);
		s.push(3);

		s.pop();
		s.pop();
		
		System.out.println("Maximum element is " + s.max());

		s.print();

	}

}

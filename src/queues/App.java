package queues;

public class App {

	public static void main(String[] args) {
		queue q = new queue();
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		q.deQueue();
		q.deQueue();
		q.deQueue();
		
		q.print();

	}

}

package sorting;

public class App {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 7, 3, 9, 23, 27 };

		sorts bb = new bubbleSort();

		bb.print(arr);

		bb.sort(arr);

		bb.print(arr);

	}

}

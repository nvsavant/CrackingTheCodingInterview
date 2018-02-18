package searching;

public class maximaBitonicArray {

	public static void main(String[] args) {
//		int arr[] = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };

//		 int arr[] = {1, 3, 50, 10, 9, 7, 6};

//		 int arr[] = {10, 20, 30, 40, 50};

		 int arr[] = {120, 100, 80, 20, 0};

		System.out.println(SearchBitonicArrayMax(arr));

	}

	static int SearchBitonicArrayMax(int arr[]) {
		int low = 0;
		int high = arr.length - 1;

		return bitonicArraySearch(arr, low, high);
	}

	private static int bitonicArraySearch(int[] arr, int low, int high) {
		int mid = (low + high) / 2;

		if (arr[mid] < arr[mid + 1]) {
			return bitonicArraySearch(arr, mid, high);
		} else if (arr[mid] < arr[mid - 1]) {
			return bitonicArraySearch(arr, low, mid);
		} else {
			return arr[mid];
		}

	}

}

package searching;

public class buySellStock {

	public static void main(String[] args) {
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };

		stockBuySell(price);

	}

	private static void stockBuySell(int[] price) {
		int buyIndex = 0;
		int sellIndex = 0;
		int minItem = Integer.MAX_VALUE;
		int maxItem = Integer.MIN_VALUE;
		
		for(int i=0;i<price.length;i++) {
			
		}
		
		
		System.out.println("Buy on:" + buyIndex + " and Sell on:" + sellIndex);
		
	}

	//O(N*N)
//	private static void stockBuySell(int[] price) {
//		int buyIndex = 0;
//		int sellIndex = 0;
//		int profit = 0;
//
//		for (int i = 0; i < price.length; i++) {
//			for (int j = i + 1; j < price.length; j++) {
//				int diff = price[j] - price[i];
//				if (diff > profit) {
////					System.out.println(i);
//					profit = diff;
//					buyIndex = i;
//					sellIndex = j;
//				}
//			}
//		}
//		System.out.println("Buy on:" + buyIndex + " and Sell on:" + sellIndex);
//	}

}

package strings;

public class powerFunction {
	
	static int pow(int x, int n) {
		if(n == 0) {
			return 1;
		}
		return x*pow(x,n-1);
	}

	public static void main(String[] args) {
		int x = 2;
		int n = 31;
		System.out.println(x+"^"+n+" = "+pow(x, n));

	}

}
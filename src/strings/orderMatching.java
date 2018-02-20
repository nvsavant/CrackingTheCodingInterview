package strings;

public class orderMatching {
	
	static boolean isOrderMatch(String source, String pattern) {
		int sourceLen = source.length();
		int patternLen = pattern.length();
		
		int iPattern = 0;
		
		for(int i =0;i<sourceLen;i++) {
			if(source.charAt(i)== pattern.charAt(iPattern)) {
				iPattern++;
			}
			
			if(iPattern == patternLen) {
				return true;
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isOrderMatch("ABCDEFGIJKLMNOPQRSTUVWXYZ", "JST"));

	}

}

package recursionPorgrams;

public class CountDigitsByUsingRecursion {
	
	
	public  static int countDigit(int n) {
		
		
		if(n>=0 && n<=9)
			
			return 1;
		
		else
			
			return 1+countDigit(n/10);
	}

	public static void main(String[] args) {
		
		
		System.out.println(countDigit(12345));//5
		
		System.out.println(countDigit(123401015));//9

	}

}

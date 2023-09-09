package recursionPorgrams;

public class ReverseIntegerNumber {
	
	
	public static int reverse(int n, int len) {
		
		
		if(n==0)
			
			return 0;
		
		else 
			
			return ((n%10)*(int)Math.pow(10, len-1)) +reverse(n/10,--len);
		
	}
	
	

	public static void main(String[] args) {
		
		
		
		
		
		
		System.out.println(reverse(1234,4));

	}

}

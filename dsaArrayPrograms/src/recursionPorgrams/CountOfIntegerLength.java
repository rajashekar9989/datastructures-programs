package recursionPorgrams;

public class CountOfIntegerLength {
	
	
	public static  int count(int n) {
		
		
		int count =0;
		
		while(n!=0) {
			
			
			
			n=n/10;// removing the last digit of number
			
			count =count+1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		
		
	
		System.out.println(count(123456));
		
		
	
		// TODO Auto-generated method stub

	}

}

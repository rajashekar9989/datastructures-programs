package dsaBitManipulation;

public class CountSetBitApplication {
	
	/* count set bit application means we have to count how many ones are there in given binary number
	 * 
	 * 
	 */
	
	
	public  static int countSetBits(int n) {
		
		int c =0;
		
		while(n!=0) {
			
		if((n&1)!=0)
			
			c++;
		
		n= n>>1;
			
		}
		
		return c;
		
		
	}

	public static void main(String[] args) {
		
		
		
		
		for(int i =0;i<=10;i++) {
			
			
			System.out.println(i +"\t" +countSetBits(i));
		}

	}

}

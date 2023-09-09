package recursionPorgrams;

public class CalculatePowerOfNumbers {
	
	
	public static int power(int a, int b) {
		if(b>=1)
			
			return a*power(a,b-1);
		
		else
			
			return 1;// base condition 
		
		
		
	}  

	public static void main(String[] args) {
		
		System.out.println(power(2,8));

	}

}

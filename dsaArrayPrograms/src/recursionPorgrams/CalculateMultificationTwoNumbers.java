package recursionPorgrams;

public class CalculateMultificationTwoNumbers {

	
	public static int product(int a,int b) {
		
		if(a<b)
			
			return product(b,a);
		
		else if(b!=0)
			
			return a+product(a,b-1);
		
		else
			
			return 0;// base condition
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(product(8,2));

	}

}

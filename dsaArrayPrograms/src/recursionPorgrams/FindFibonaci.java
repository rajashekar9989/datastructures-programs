package recursionPorgrams;

public class FindFibonaci {
	
	
	public static int fib(int n) {
		
		
		if(n==0 || n==1) // base case or base condition
			
			return 1;
		
		else if(n==2)
		
		  return  1;
		
		else 
			
			return fib(n-1)+fib(n-2);
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		System.out.println(fib(n));// 0 1 1 2 3 5 8 13 21 34 55 89  // o/p : 34

	}

}

package dsaBitManipulation;

public class FindFastExponetianl {
	
	
	
	public static int fastExpo(int a , int n) {
		
		int res=1;
		
		while(n!=0) {
			
			if((n&1)!=0)
				
				res=res*a;
			
			
			a=a*a;
			n=n>>1;
			
			
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fastExpo(2,8));//256
		System.out.println(fastExpo(2,4));//2*2*2*2 =16
		
		System.out.println(fastExpo(3,3));//256

	}

}

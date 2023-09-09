package recursionPorgrams;




class Demo1{
	static void m(int n){
		if(n>=1)//base condition
		{
			//System.out.print(n+" ");// 54321
			m(n-1);
			
			System.out.print(n+" ");// 1234
		}
	}
}


public class PrintNaturalNumbersToN {
	
	
	

		public static void main(String[] args) 
		{
			Demo1.m(5);
		}
	}




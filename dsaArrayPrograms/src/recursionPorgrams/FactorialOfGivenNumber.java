package recursionPorgrams;


	
	
	class Demo3{
		static int fact(int n){
			if(n==0)
				return 1;
			else
				return n*fact(n-1);
		}
	}

	public class FactorialOfGivenNumber {
		public static void main(String[] args) 
		{
			System.out.println(Demo3.fact(5));//120
		}
	}




package recursionPorgrams;


	
	
	
	class Demo4{
		static int sumofdigits(int n){
			if(n==0)
				return 0;
			else
				return n%10 + sumofdigits(n/10);
		}
	}

	public class SumOfDigitsInGivenNumber {
		public static void main(String[] args) 
		{
			System.out.println(Demo4.sumofdigits(123456));//1+2+3+4+5+6=21
		}
	}




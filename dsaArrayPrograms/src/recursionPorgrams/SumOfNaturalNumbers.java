package recursionPorgrams;


	
	
	class Demo2{
		static int sum(int n){
			if(n==0)
				return 0;
			else
				return n+sum(n-1);
		}
	}

	public class SumOfNaturalNumbers {
		public static void main(String[] args) 
		{
			System.out.println(Demo2.sum(5));//15
		}
	}




package DefaultMethods;

import java.util.function.Predicate;

public class PredicateJoining1 {



		public static void main(String[] args) {

			
			int [] x = {0,5,10,15,20,25,30,35};
			
			Predicate<Integer> p1=  i->i%2==0;
			
			Predicate<Integer> p2=  i->i>10;
			//and().or(),negate()
			
			System.out.println("the numbers are even  and > 10 are");
			
			for(int x1 :x) {
				
				if(p1.negate().test(x1)) {// negate() method opposite of original function
				
					System.out.println(x1);//20,30
				}
			}
			
//			for(int x1 :x) {
//			if(p1.or(p2).test(x1)) {// or joining
//				
//				System.out.println(x1);//0,5,10,15,20,25,30,35
//			}
//		}
//


		}

}

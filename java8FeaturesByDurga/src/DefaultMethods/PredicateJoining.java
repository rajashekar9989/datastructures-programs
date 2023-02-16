package DefaultMethods;

import java.util.function.Predicate;

/*p1---> to check whether number is even or not.
 * 
 * p2-->to check whether number >10 or not
 * 
 * p1.and(p2).test(34)
 * 
 * predicate Joining:
 * 
 * p1.or(p2)
 * 
 * p1.negate();
 * 
 * 
 */

public class PredicateJoining {

	public static void main(String[] args) {

		
		int [] x = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p1=  i->i%2==0;
		
		Predicate<Integer> p2=  i->i>10;
		//and().or(),negate()
		
		System.out.println("the numbers are even  and > 10 are");
		
		for(int x1 :x) {
			
			if(p1.and(p2).test(x1)) {// and joining operartor
				
				System.out.println(x1);//20,30
			}
		}
		
		for(int x1 :x) {
		if(p1.or(p2).test(x1)) {// or joining
			
			System.out.println(x1);//0,5,10,15,20,25,30,35
		}
	}



	}

}

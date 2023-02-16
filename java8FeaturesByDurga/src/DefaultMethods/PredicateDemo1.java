package DefaultMethods;

import java.util.function.Predicate;


//write a predicate to check whether length of the string is >5 or not.



public class PredicateDemo1 {

	public static void main(String[] args) {
		
		
		String[] N= {"Nag", "chiranjeevi","venkatesh","balaiah","sunny","katrina"};
		
		Predicate<String> p  = s->s.length()>5;
		
	//Predicate<String> p = s1->s1.length()%2==0;
		
		for(String s1 :N) {
			
			if(p.test(s1)) {
				
				System.out.println(s1);
			}
			
			
		}
		
		
		
		
		
		

	}

}

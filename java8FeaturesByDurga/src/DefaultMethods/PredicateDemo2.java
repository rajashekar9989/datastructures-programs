package DefaultMethods;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
	
		
		String[] N= {"Nag", "chiranjeevi","venkatesth","balaiah","sunny","katrina","Raja"};
		
		Predicate<String> p = s->s.length()%2==0;
		
		for(String s1:N) {
			
			if(p.test(s1)) {
				
				System.out.println(s1);
			}
		}

	}

}

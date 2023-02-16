package primitiveVersionOfFunctionalInterface;



//primitive version predicate  we know the Integer data type  before the perform then we can use IntPredicate

// because normal predicate  accept data in the form of all wrapper classes like  (Integer, Double,Boolean,Float,Long) and  

//conversion happen two types i.e  we are giving int so it converts  to integer and perform the operation   and again convert to int 

// print the result hence: AutoBoxing and UnbOXING HAPPENS IT MAY CAUSE REDUCE THE PERFORMANCE.

// so that we have IntPredicate, DoublePredicate,LongPredicate.


import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		
		
		int [] x = {0,5,10,15,20,25,30,35,40,45};
		
		IntPredicate p = i->i%2==0;
		
		for(int x1 :x) {
			
			if(p.test(x1)) {
				
				System.out.println(x1);
			}
		}
		
		
		
		

	}

}

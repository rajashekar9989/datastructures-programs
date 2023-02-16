package DefaultMethods;

import java.util.function.Predicate;

/*
 *  predicate<T> is the functional interface which contains single abstract method.
 *  
 *  that method is : 
 *  
 *  public boolean Test(Integer I){
 *  
 *   If(I%2==0){
 *   
 *   return true;
 *   }
 *   
 *   else {
 *       return false;
 *   }
 *   
 *   (Integer I )-->(I%2==0)
 *   
 *   
 */


public class PredicateDemo {

	public static void main(String[] args) {
		
		
		Predicate<Integer> p1 = i->i%2==0;
		
		System.out.println(p1.test(10));// true
		
		System.out.println(p1.test(15));// false

	}

}

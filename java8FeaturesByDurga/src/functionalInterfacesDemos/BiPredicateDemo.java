package functionalInterfacesDemos;

import java.util.function.BiPredicate;

/*
 * BiPredicate functional interface
 * 
 * 
 * Noraml predicate can take only one input argument and perform some conditional check.
 * 
 * some times our programming requirement is  we have to take  2 input arguments and perform some conditional check,
 * 
 * for this requirement  we should go for BiPredicate.
 * 
 * BiPreducate us exactly same as predicate except that it will take 2 input arguments.
 * 
 * interface BiPredicate<T1, T2>
 * {
 * 
 * public boolean test(T1 t1,T2 t2);
 *  
 *  remaining default and static methods are same
 * }
 * 
 * it is two input aruguments
 * 
 * 1.whether the given int is even or not --->predicate.
 * 
 * check the sum of 2 given numbers is even
 * 
 * 
 * To check sum of 2 given Integers is even or not by using BiPredicate.
 * 
 */

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p =(a,b)->(a+b)%2 ==0;
		
		System.out.println(p.test(10, 20));
		
		System.out.println(p.test(15, 20));

	}

}

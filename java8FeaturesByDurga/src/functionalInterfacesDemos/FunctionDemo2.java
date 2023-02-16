package functionalInterfacesDemos;

import java.util.function.Function;

/*Function Chaining
 * 
 * f1.andThen(f2).apply(i0
 * 
 * first f1 and followed by f2.
 * 
 * f1.compose(f2).apply(i)
 * 
 * first f2 and then f1
 * 
 * 
 * 
 */

public class FunctionDemo2 {

	public static void main(String[] args) {
//		Function<Integer,Integer> f1 = i->i*2;// 2*2 =4
//		
//		Function<Integer,Integer> f2 = i->i*i*i;// 4*4*4=64
//		
//		System.out.println(f1.andThen(f2).apply(2));
		
		
Function<Integer,Integer> f1 = i->i*2;// 8*2 =16
		
		Function<Integer,Integer> f2 = i->i*i*i;// 2*2*2=8
		
		System.out.println(f1.compose(f2).apply(2));
		//f1.andThen(f2).andThen(f3).apply(10);
		

	}

}

/*  java 8 Pre Defined functional interfaces
 * 
 * Predicate<T> ---->  one method Boolean return type; test() method
 * Function<T,R>------R return type --> apply() method.
 * 
 * consumer<T>---Void
 * 
 * 
 * 
 */




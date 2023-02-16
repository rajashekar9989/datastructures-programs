package primitiveVersionOfFunctionalInterface;

import java.util.function.UnaryOperator;


/*  UnaryOperator
 * 
 * if input and output are same type then we should go for UnaryOperatror.
 * 
 * it is a child of Function Interface<T,T>.
 * 
 * PRESENT IN java.util.function.*;
 * 
 * 
 */



public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UnaryOperator<Integer>f =i->i*i;
    
    System.out.println(f.apply(5));
	}

}

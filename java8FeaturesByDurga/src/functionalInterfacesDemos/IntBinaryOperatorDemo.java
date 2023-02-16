package functionalInterfacesDemos;

import java.util.function.IntBinaryOperator;

/* Primitive types of BinaryOperator
 * 
 * IntBinaryOperator
 * 
 * LongBinaryOperator
 * 
 * DoubleBinaryOperator.
 * 
 * 
 */
public class IntBinaryOperatorDemo {

	public static void main(String[] args) {
		
		IntBinaryOperator b =(i1,i2)->i1*i2;
		System.out.println(b.applyAsInt(30,20));

	}

}

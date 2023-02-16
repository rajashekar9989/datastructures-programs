package primitiveVersionOfFunctionalInterface;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

/* Primitive Function Types ;
 * 
 * 1.IntFunction :can take int type as input
 * 
 * 2.LongFunction: can Take Long as Input type
 * 
 * 3.DoubleFunction: can take double as input and return type can be any type;
 * 
 * 
 * DoubleToIntFunction:input type :double and return type : int.
 * 
 * int applAsInt(Double value)
 * 
 * DoubleToLongFunction: input type :double and return type : Long.
 * 
 * IntToDoubleFunction:
 * IntToLongFunction:

   LongToIntFunction:
 * LongToDoubleFunction:
 * 
 * ToLongFunction:return type should be long.
 * 
 * ToDoubleFunction:return type should be Double.
 * 
 *ToIntFunction : return type should be Integer.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class IntFunctionDemo {
	
	public static void main(String[] args) {
		
		
		
		IntFunction<Integer> f =i->i*i;
		
		System.out.println(f.apply(5));
		
		//ToIntFunction
		
		ToIntFunction<String> f1 = s->s.length(); 
		
		System.out.println(f1.applyAsInt("Rajashekar"));
		
		//FUNCTION
		
		Function<Integer,Double> f2=i->Math.sqrt(i);
		System.out.println(f2.apply(9));
		
		
		
		
	}

}

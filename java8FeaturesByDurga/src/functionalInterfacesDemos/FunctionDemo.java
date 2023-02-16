package functionalInterfacesDemos;

import java.util.function.Function;

public class FunctionDemo {
	
	//Function<T,r> is the one of the Functional interface which contains single abstract method 
	// i.e. apply() method
	
	// it takes two arguments one is input and output i.e. Function<String,Integer> here string is input data type and Integer is output data type

	public static void main(String[] args) {
		
		
		Function<Integer,Integer> f =i->i*i;
		
		System.out.println(f.apply(4));//16
		
		System.out.println(f.apply(8));//64

	}

}

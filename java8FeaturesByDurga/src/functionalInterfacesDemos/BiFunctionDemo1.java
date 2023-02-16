package functionalInterfacesDemos;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String,String,String> f=(s1,s2)->s1+s2;
		
		System.out.println(f.apply("Durga", "Software"));

	}

}

package functionalInterfacesDemos;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
	
		
		Function<String,Integer> f = s->s.length();
		
		System.out.println(f.apply("Rajashekar"));//10 return length of the string 
		
		System.out.println(f.apply("durga"));//5
		
		Function<String,String>f1 =s->s.toUpperCase();
				
		Function<String,String> f2 =s ->s.toLowerCase();
		
		System.out.println(f1.apply("rajashekar reddy"));//RAJASHEKAR REDDY
		
		System.out.println(f2.apply("RAJASHEKAR REDDY"));// rajashekar reddy
		
		

	}

}

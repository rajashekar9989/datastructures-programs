package functionalInterfacesDemos;

import java.util.function.Supplier;

/* to generate 6 digits otp.
 * 
 * Math.random(); -- this method generate 0 t0 1 random numbers
 * 
 * 0 is min
 * 0.999999 and 1  is max.
 * 
 * we want to generate 6 digits otp with 0 to 9 random numbers
 * 
 * 
 * Accept some input and perform required operation and not required to return  anything --> Consumer
 * 
 * Just Supplied  my required  objects and its won't take any input--->Supplier\
 * 
 * 
 * interface Supplier<R>{
 * 
 * public R get();
 * 
 * }
 * 
 * 1.Predicate---->test();
 * 2.Function--->apply();
 * 
 * 3.consumer--->accept();
 * 
 * 4.Supplier---> get();
 * 
 *
 * 
 * 
 * 
 * 
 */
public class SupplierDemo1 {

	public static void main(String[] args) {
	
		
		Supplier<String>s =()->{
		
			String otp="";
			
			for(int i =0; i<6;i++) {
				
				otp =otp+(int)(Math.random()*10);
			}
			
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}

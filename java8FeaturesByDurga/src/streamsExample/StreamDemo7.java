package streamsExample;



import java.util.ArrayList;
import java.util.function.Consumer;

/*
 * 1.stream().forEach(Function)
 * 
 * 1.stream().forEach(System.out :; println)
 * 
 * toArray();
 * 
 * To convert stream of objects into array
 * 
 * 
 */

public class StreamDemo7 {

	public static void main(String[] args) {
	
		
		
ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(0);
		l.add(5);
		l.add(2);
		
		System.out.println(l);
		
		Consumer<Integer> c =i->
		{
			System.out.println("The square of "+i+ "is; "+(i*i));
			
		};
		
		l.stream().forEach(c);

	}

}

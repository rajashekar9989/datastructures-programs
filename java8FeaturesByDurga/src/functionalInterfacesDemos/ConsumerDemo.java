package functionalInterfacesDemos;

import java.util.function.Consumer;

/* Consumer is one of the functional interface which contains single anstract method i.e. accept() method.
 * 
 * 
 * interface Consumer<T>
 * public void accept(T , t);
 * 
 * 
 */
public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c =s->System.out.println(s);
		
		c.accept("Durga");
		c.accept("Durga Software");

	}

}



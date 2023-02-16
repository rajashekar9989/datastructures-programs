package functionalInterfacesDemos;

import java.util.function.Consumer;

public class ConsumerInterDemo {

	public static void main(String[] args) {
	
		
		Consumer<Movie> c1 = m->System.out.println(m.name + " is Ready to release");
		
		Consumer<Movie> c2 =m->System.out.println(m.name  + " is released but it is biggest flop");
		
		
	   Consumer<Movie> c3 =m->System.out.println(m.name+" is storing i nformation in database");
	   
	   Consumer<Movie> cc =c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("spider");
		
		//c1.accept(m);
		
		cc.accept(m);
		
	//	c1.andThen(c2).andThen(c3);
		
		

	}

}

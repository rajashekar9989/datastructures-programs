package functionalInterfacesDemos;

/*
 * 
 * Predicate, Function,Consumer, Supplier
 * 
 * 
 * Take some input and perform some conditional check and return boolean value is --> Predicate.
 * 
 * Take some input and perform some operation  and return the result  which is need not be boolean  type --> Function
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
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionaInterDemo {

	public static void main(String[] args) {
		
		Function<Student, String> f=s->{
			
			int marks=s.marks;
			String grade="";
			if(marks>=80)grade ="A[Dictinction]";
			
			else if (marks>=60) grade="B[First Class";
			
			else if(marks>=50) grade="C[second class]";
			
			else if(marks>=35) grade ="D[third class]";
			
			else grade ="[Failed]";
			
			return grade;
		
		};
		Predicate<Student> p =s->s.marks>=60;
		
		Consumer<Student> c =s->
		
		System.out.println("Student name "+s1.name);
		System.out.println("Student marks "+s1.marks);
		System.out.println("Student name "+f.apply(s1));
		
		System.out.println();

	};
	
	
	Student []  s= { new Student("Durga", 100),
			         new Student("Sunny", 65),
			         new Student("Bunny", 55),
			         new Student("Chinny", 45),
			         new Student("Vinny", 25)
	       
	};
	
	for(Student s1 :s) {
		
		
		
		c.accept(s1);
//		if(p.test(s1)) {
//			
//			System.out.println("Student Name "+s1.name);
//		}
	}
	
	
	
//	for(Student s1 :s) {
//		
//		if(p.test(s1)) {
//			
//			c.accept(s1);
//		}
//
//}
//}


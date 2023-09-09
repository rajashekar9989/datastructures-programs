package streamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*Collection and Streams
 * 
 * if we want to represent a group of objects as single entity then we should go for Collection.
 * 
 * 
 * if we want process the objects from  the collection  we should go for stream()
 * 
 * in the streams we have two methods  one is filter and map.
 * 
 * fliter based on the marks : select only passed students 
 * 
 * marks.stream().filter(m->m>=35)
 * 
 * Add 5 grace marks
 * 
 * failedStudents.stream().map(i->i+5).collect(Collectors.toList());
 * 
 * filter:
 * --------------------------
 * input--->10 elements
 * 
 * output---> 0 to 10 or <=10;
 * 
 * Map:
 * 
 * -----------------------
 * input :10 elements
 * output:10 elements
 * 
 * stream()
 * filter()
 * map()
 * collect()
 * count()
 * sorted()
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println(l);
		
		 
		
		List <Integer>l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
		  
		  System.out.println(l2);

	}

}

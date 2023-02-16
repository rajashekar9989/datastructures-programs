package streamsExample;



import java.util.ArrayList;


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
 * stream()
 * filter()
 * map()
 * collect()
 * 
 * count()
 * sorted()
 * sorted(Comparator)
 * min(comparator)
 * max(Comparator)
 * forEach()
 * toArray()
 * 
 */

public class StreamDemo8 {

	public static void main(String[] args) {
ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(0);
		l.add(5);
		l.add(2);
		
		System.out.println(l);
		
		Integer[] i=(Integer[]) l.stream().toArray(Integer []:: new);
		
		for(Integer i1 : i) {
			
			System.out.println(i1);
		}


	}

}

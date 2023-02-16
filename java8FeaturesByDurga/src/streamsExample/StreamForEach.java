package streamsExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamForEach {

	public static void main(String[] args) {
		
//ArrayList l = new ArrayList();
//		
//		l.add(9);
//		l.add(99);
//		l.add(999);
//		l.add(9999);
//		l.add(99999);
//		l.add(999999);
//		
//		System.out.println(l);
		
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		
		s.forEach(System.out :: println);
		
		Integer[] i = {10,20,30,40,50};
		
		Stream.of(i).forEach(System.out :: println);
		
		

	}

}

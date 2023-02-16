package streamsExample;

import java.util.ArrayList;

public class StreamMinDemo {

	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(0);
		l.add(5);
		l.add(2);
		
		System.out.println(l);
		
		Integer min= (Integer) l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println(min);//0
		
		Integer max= (Integer) l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println(max);//20
		

	}

}

package streamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
comparator-->compare(obj1, obj2)
* 
* return -1 if obj1 has come before obj2.
* 
* return +1 if obj1 has come after obj2.
* 
* return 0 if obj1 and obj2 both are equal.
* 
* sorted()-->According to default natural sorting order.
* 
* sorted(Comparator)--> customized sorting order.
* 
* 
*/
public class StreamDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(98);
		marks.add(67);
		marks.add(78);
		marks.add(56);
		marks.add(45);
		marks.add(88);
		
		System.out.println(marks);
	
		
		
		
	List naturalSortingmarks =	marks.stream().sorted().collect(Collectors.toList());
	
	
		System.out.println(naturalSortingmarks);
		
		
		List decendingorderMarks = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		

		System.out.println(decendingorderMarks);
	}

}

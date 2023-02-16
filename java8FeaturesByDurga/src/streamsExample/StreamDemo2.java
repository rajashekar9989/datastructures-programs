package streamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* comparator-->compare(obj1, obj2)
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

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(76);
		marks.add(34);
		marks.add(98);
		marks.add(45);
		marks.add(35);
		marks.add(25);
		marks.add(20);
		
	System.out.println(marks);
	
    long failedStudents =marks.stream().filter(m->m<35).count();
    
    System.out.println(failedStudents);
    
    //sortedList
    
  List<Integer> sortedlistmarks=  marks.stream().sorted().collect(Collectors.toList());

  
   System.out.println(sortedlistmarks);
	}

}

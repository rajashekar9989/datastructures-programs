package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Comparator;

//class SortById implements Comparator<Student>{
//
//	@Override
//	public int compare(Student s1, Student s2) {
//		
//		return s1.id -s2.id;
//	}
//	
//	}


class SortByPer implements Comparator<Student>{

	@Override
	public int  compare(Student s1, Student s2) {
		
		return (s1.percentage - s2.percentage)<0?1:-1;
	}
	
	
}


class SortByName implements Comparator<Student>{

	@Override
	public int  compare(Student s1, Student s2) {
		
		return (s1.name).compareTo(s2.name);
	}
	
	
}



public class SortStudentObjectBasedOnId  {

	public static void main(String[] args) {
		
		
		Student s[] = {
				
				new Student(222,"raj",80.8),
				
				new Student(555,"shekar",89.9),
				
				new Student(99,"Anu",78.0),
				
				new Student(11,"swamy",98.9)
		};
		
		System.out.println(Arrays.toString(s));
		
		
		//Arrays.sort(s, new SortById());
		
		//Arrays.sort(s, new SortByPer());
		
		Arrays.sort(s,new SortByName());
		
	
		
	System.out.println(Arrays.toString(s));
		
		
	

	}

}

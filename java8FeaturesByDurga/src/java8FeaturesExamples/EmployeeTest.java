package java8FeaturesExamples;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
	
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(3356,"ravi"));
		al.add(new Employee(9989,"ramesh"));
		al.add(new Employee(1234,"Raj"));
		al.add(new Employee(2234,"shekar"));
		al.add(new Employee(2245,"swamy"));
		
		System.out.println(al);
		
		//Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		//Collections.sort(al,(e1,e2)->(e1.ename<e2.ename)?-1:(e1.ename>e2.ename)?1:0);
		
		
		
		System.out.println(al);
		

	}

}

package functionalInterfacesDemos;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
//		l.add( new Employee("Durga",1000));
//		l.add( new Employee("Sunny",2000));
//		l.add( new Employee("Bunny",3000));

		
		populate(l);
		BiConsumer<Employee,Double> c=(e,d)->e.empSalary=e.empSalary+d;
		
		
		
		
		
		for(Employee e : l ) {
			
			
			
			c.accept(e, 500.0);
		}
		
		for(Employee e : l) {
			
			System.out.println("Employee Name :" + e.empName);
			
			System.out.println("Employee Salary :" + e.empSalary);
			System.out.println();
		}
		
		

	}
	
	public static void populate(ArrayList<Employee>l) {
		
		l.add( new Employee("Durga",1000));
		l.add( new Employee("Sunny",2000));
		l.add( new Employee("Bunny",3000));

		
		
		
		}

}

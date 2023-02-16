package functionalInterfacesDemos;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new  ArrayList<Employee>();
		
		BiFunction<Integer,String,Employee> f=(empName,empSalary)->new Employee(empSalary,empName);
		
		l.add(new Employee("Durga",100));
		
		l.add(new Employee("Ravi",200));
		l.add(new Employee("shiva",300));
		l.add(new Employee("Pavan",400));
		
		for(Employee e : l) {
			
			System.out.println("employee Name"+e.empName);
			
			System.out.println("employee salary"+e.empSalary);
			System.out.println();
			
		}
		
		
		
		

	}

}

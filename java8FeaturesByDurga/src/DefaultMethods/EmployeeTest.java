package DefaultMethods;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("durga",1000));
		l.add(new Employee("Ravi",2000));
		l.add(new Employee("shiva",3000));
		l.add(new Employee("mahesh",4000));
		l.add(new Employee("adarsh",5000));
		l.add(new Employee("sagar",6000));
		
		
		Predicate<Employee> p =e->e.empSalary>3000;
		
		for(Employee e1 :l) {
			
			if(p.test(e1)) {
				
				System.out.println(e1);
				
				
			}
		}
		

	}

}

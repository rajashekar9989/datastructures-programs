package functionalInterfacesDemos;

public class Employee {
	
	String empName;
	
	double empSalary;

	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

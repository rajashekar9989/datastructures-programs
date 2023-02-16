package java8FeaturesExamples;

public class Employee {
	
	
	String ename;
	int eno;
	
	
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	

}

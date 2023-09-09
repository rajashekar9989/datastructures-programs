package sortingTechniquesArray;

public class Student {

	
	int id;
	String name;
	double percentage;
	
	Student(int id,String name,double percentage){
		
		
		this.id =id;
		this.name = name;
		this.percentage =percentage;
	}

	
	
	
	
	
	
	public String toString() {
		
		
		return "(" +this.id + ","+this.name +" " +this.percentage+")";
	}
}


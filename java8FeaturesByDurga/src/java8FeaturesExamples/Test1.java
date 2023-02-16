package java8FeaturesExamples;


class Demo1 implements Interfre1{

	@Override
	public void add(int a, int b) {
		
		System.out.println("the sum "+(a+b));
		
		
	}
	
	
}

public class Test1 {
	
	
public static void main(String[] args) {
	Interfre1 i = new Demo1();
	
	i.add(10, 20);
	
	i.add(30,40 );
	i.add(50,60);
}
}

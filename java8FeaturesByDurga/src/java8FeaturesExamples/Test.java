package java8FeaturesExamples;


class Demo implements Interfre{

	@Override
	public void m1() {
		
		
		System.out.println("Hello");
		
	}
	
	
}

class Test {
	
	public static void main(String[] args) {
		
		//Demo d = new Demo();
		
		//d.m1();
		
		Interfre i =()-> System.out.println("Hello... By Lambda expression");
		
		i.m1();
		i.m1();
		i.m1();
		i.m1();
	}
}
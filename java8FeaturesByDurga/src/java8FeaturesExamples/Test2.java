package java8FeaturesExamples;

public class Test2 {
	
	public static void main(String[] args) {
		
		InterfaceRef i =Sample :: new;
		
		Sample s1=i.get("Durga");
		
		//Sample s2=i.get();
		
		Sample s3=i.get("Raja");
		
	}

}

package java8FeaturesExamples;

public class Demo2 {

	public static void main(String[] args) {
		
		
		InterFaceDemo i=(a,b)->System.out.println("THE SUM "+(a+b));
		
		i.add(10,20);
		InterFaceDemo i1 =Demo2 :: sum;
		//Demo2:: new ===> constructor reference
		i1.add(100, 200);

	}
	
	
	public static void  sum(int x, int y) {
		
		
		System.out.println("The sum"+(x+y));
	}

}

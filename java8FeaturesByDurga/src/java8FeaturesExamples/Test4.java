package java8FeaturesExamples;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i =0;i<10;i++) {
		
		System.out.println("Child thread");
		
	}
	
	
}
}

public class Test4 {

	
	public static void main(String[] args) {
		
	
		Runnable r =()->{
			
			for(int i =0;i<=10;i++) {
				
				System.out.println("child thread");
			}
		};
	
	
      //	MyRunnable r = new MyRunnable();
	
	Thread  t = new Thread(r);
	
	t.start();
	
	
	for(int i =0;i<=10;i++) {
		
		System.out.println("main thread");
	}
}
}


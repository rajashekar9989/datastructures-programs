package DefaultMethods;

public interface InterfaceDemo {
	
	public abstract void m1();
	
	
	 default void m2() {
		
		System.out.println("interface default method");
	}
	

}



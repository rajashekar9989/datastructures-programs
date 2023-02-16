package dataStructuresExamples;

 class Demo {
	int x,y;
	Demo(){
		
		this.x  =0;
		this.y=0;
	}
	
	Demo(int x, int y){
		
		this.x =x;
		this.y =y;
	}
	
	void show() {
		
		System.out.println("X ="+this.x +" "+"Y ="+this.y) ;
	}
	
	public String toString() {
		
		return ("X = "+this.x+" And "+"Y ="+this.y);
	}

}

 public class Test{
	
	
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(100,200);
		Demo d2 = new Demo(300,400);
		
//		d.show();// 0,0
//		d1.show();
//		d2.show();
		
		System.out.println(d);//demo@hashcode1 and 0,0
		
		System.out.println(d1);//demo@hashcode1 and 100,200 because of tostring() method
		System.out.println(d2);//demo@hashcode1 and 300,400 because of toString() method
		
		
		String s ="abc";
		System.out.println(s);// string class overriden tostring method
		
		StringBuffer sb = new StringBuffer("Welcome");
		
		System.out.println(sb);
	}
	
	// toString() METHOD IMPLEMENTATION
	
	
}
 

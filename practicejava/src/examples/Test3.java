package examples;

public class Test3 {

	public static void main(String[] args) {

		
		SLL obj1 = new SLL();
		
		

		SLL obj2=new SLL();
		
		obj1.addLast(111);
		obj1.addLast(222);
		obj1.addLast(333);
		obj1.addLast(444);
		obj1.addLast(999);
		
		
		obj1.display();
		
		obj2.addLast(111);
		obj2.addLast(222 );
		obj2.addLast(555);
		obj2.addLast(444);
		obj2.addLast(999);
		
		
	
	obj2.display();
	
	System.out.println(obj1.compareList(obj1.head, obj2.head));
	
	
	
		
		//obj.reverse();//999,444,333,222,111
		
		//obj.removeDuplicate();
		
		//System.out.println(obj.search(6));
		
		//obj.display();
		
		
		


		
		
		
		
	}

}

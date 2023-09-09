package serializationPrograms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


//serialization : it is the process of converting  the state of object into byte stream.

	//Deserialization : Deserialization is reverse process where the  byte stream is used recreate the actual  object in memory.
	
	// the use of both is to travel an object across a network are to save  a file  or save in database for later usage.
	
	//byte stream created  is platform independent .i.e  so the objects serialized one one platform can be deserialized in a different platform.
	
	//we can use serialization so that we can implement a serializable interface.


// object---> byte stream --->by using class --I.e ObjectOutputStream in that writeObject() method.

//Byte Stream ----> Object --->By using class -->i.e ObjectInputStream  in that ReadObject() method.

class Employee  implements Serializable {
	
	String name;

	int num;
	
	
  Employee(String name, int num){
	  
	  
	  this.name = name;
	  this.num = num;
  }
	
}



public class SerializationDemo  {
	
	

	public static void main(String[] args) {

	Employee emp = new Employee("Raj",225);
//		
//		
//		try {
//			
//			FileOutputStream fout = new FileOutputStream("D:\\Raj.txt");
//			
//			ObjectOutputStream  out = new ObjectOutputStream(fout);
//			
//			        out.writeObject(emp);
//			        
//			        out.close();
//			        
//			        fout.close();
//			        
//			        System.out.println("success");
//			
//		}
//		
//		
//		catch(Exception e) {
//			
//			e.printStackTrace();
//			
//			
//			
//		}
		
		
		// Deserialization 
		
		
		try {
			 
			FileInputStream fin = new FileInputStream("D:\\Raj.ser");
			
			
			ObjectInputStream in  = new ObjectInputStream(fin);
			
			
			 Employee e2 =(Employee) in.readObject();
			 
			 in.close();
			 
			 fin.close();
			 
			 System.out.println(emp.name+"  "+emp.num);
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}

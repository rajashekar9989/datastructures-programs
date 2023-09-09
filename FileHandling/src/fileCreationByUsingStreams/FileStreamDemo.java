package fileCreationByUsingStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStreamDemo {

	// stream is squence of data.

	// we have two types of streams one is input stream and output Stream

	// input stream : read the data from the source.

	// output stream :write the data

	public static void main(String[] args) {

	

			
//			try {
//				
//				  FileOutputStream fout = new FileOutputStream("D:\\shekar.txt");
//				
//
//				String data = "Welcome to my world";
//
//				byte  b[] = data.getBytes();
//				  
//				          
//				
//			     fout.write(b);
//	             fout.close();
//				
//	          System.out.println("Success");
//
//			}
//				
//			catch (Exception  e) {
//				
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			 }
			
			
			
		// read the data
			
	
		try {
			
			FileInputStream fi = new FileInputStream("D:\\shekar.txt");
			
		   int i = 0;
		   
		   while((i=fi.read())!=-1) {
		   
		   System.out.print((char)i);
		   
		   }
		   fi.close();
			   
		   	
			
			
			
		} catch (Exception  e) {
			
			e.printStackTrace();
			
			
			
			
		}
			
			
			
			 


		
	}
}



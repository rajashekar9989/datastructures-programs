package dsaBitManipulation;

public class CheckNumberIs2PowerOrNot {
	
	
	
	 public static boolean powerOf2(int n) {
		 
		 
		 return (n&(n-1))==0;
	 }

	public static void main(String[] args) {
		
		for(int i =0;i<=10;i++) {
			
			
			System.out.println(i +"\t" +powerOf2(i));
		}
		

	}

}

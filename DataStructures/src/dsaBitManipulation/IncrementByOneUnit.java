package dsaBitManipulation;

public class IncrementByOneUnit {
	
	
	public static int incrementOne(int n) {
		
		
		return -~n;//-(-n+1))==>n=1
	}

	public static void main(String[] args) {
	
		for(int i =0;i<=10;i++) {
			
			System.out.println(i+"\t"+incrementOne(i));
		}

	}

} 

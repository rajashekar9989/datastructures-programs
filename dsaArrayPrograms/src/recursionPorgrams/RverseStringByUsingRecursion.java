package recursionPorgrams;

public class RverseStringByUsingRecursion {
	
	
	public static String reverse(String s) {
		
		if(s.length()==0 || s.length()==1)
			
			return s;
		
	
			else
			
			return  reverse(s.substring(1))+s.charAt(0);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(reverse("java is very easy"));//avaj

	}

}

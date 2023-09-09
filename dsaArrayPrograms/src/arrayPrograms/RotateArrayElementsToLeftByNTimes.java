package arrayPrograms;

public class RotateArrayElementsToLeftByNTimes {
	
	/* input array ={1,2,3,4,5};
	
	n=3 times rotate left side
	
	
	1 rotate =2,3,4,5,1
	
	2 rotate =3,4,5,1,2
	3 rotate=4,5 ,1,2,3
	
	output is :3,4,1,2,3

*/
	public static void main(String[] args) {
		
		
		int[] arr= new int[]{1,2,3,4,5};
		
		int n =3 ;
		
		for(int i=0;i<n;i++) {
			
			int first=arr[0],j;
			
			for(j=0;j<arr.length-1;j++) {
				
				arr[j]=arr[j+1];
			}
			
			arr[j]=first;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}
	

}

package examples;

import java.util.Arrays;

public class ArrayTwoSum {

	public static void main(String[] args) {
		
		
		int[] nums = {2,7,11,15};
		
		int target =17;
		
		
		ArrayTwoSum twosum = new ArrayTwoSum();
		
		System.out.println(Arrays.toString(twosum.twoSum(nums, target)));
		
		

	}
	
	
	public int[] twoSum(int[] nums,int target) {
		
		
		for(int i=0;i<nums.length;i++) {
			
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]+nums[j]==target) {
					
					return new int[] {i,j};
				}
				
			}
				
				
		}
		
		//return null;
		
		throw new IllegalArgumentException("no such numbers found");
	}

}

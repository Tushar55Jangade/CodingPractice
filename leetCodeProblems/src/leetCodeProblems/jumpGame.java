package leetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class jumpGame {
/*
* Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/
	public static void main(String args[])
	{
		int[] nums =  {2,3,1,1,4};
		jumpGame(nums);
	}
	private static boolean jumpGame(int[] nums) {
		// TODO Auto-generated method stub
		
		int max = 0;
		
		for(int i = 0;i<nums.length;i++)
		{
			if(i>max)
			{
				//System.out.println("false");
				return false;
			}
			System.out.println(nums[i]+i +": "+max);
			max = Math.max(max, nums[i]+i);
		}
		System.out.println(max);
		return true;
		
	}
}

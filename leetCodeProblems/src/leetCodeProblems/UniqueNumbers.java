package leetCodeProblems;

import java.util.HashSet;

public class UniqueNumbers {
		public static void main(String[] args)
		{
			int[] n = {1,1,1,2,2,3,1,5,4};
			countUniqueNumber(n);
		}
		
		public static void countUniqueNumber(int[] n)
		{
			HashSet<Integer> h = new HashSet<Integer>();
			for(int i =0;i < n.length;i++){
				int c = 0;
				for(int j=0;j<n.length;j++){
					if(n[i] == n[j]){
						c++;	
					}
				}
				if(h.add(n[i])){
					System.out.println(n[i]+": "+c);
				}
			}
		}
		
}

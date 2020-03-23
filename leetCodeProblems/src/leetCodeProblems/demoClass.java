package leetCodeProblems;

public class demoClass {

	static int R = 0;
	static int C = 0;
	
	public static void FindWords(char[][] grid, String[] words) {
		
		R = grid.length;
		C = grid[0].length;
		
		for(int i =0;i<words.length;i++) {
			boolean wordFound = false;
			for (int row = 0; row < R; row++)  
	         { 
	             for (int col = 0; col < C; col++)  
	             { 
	                 if (serachwords(grid, row, col, words[i])) { 
	                     System.out.println(words[i]+ " " + row + " " + col);
	                     wordFound= true;
	                 }
	               
	             } 
	         }
			
			if(!wordFound) {
				 System.out.println(words[i]+ " " + -1 + " " + -1);
			}
		}
		
	}
	 static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };  
	 static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };  
	
	public static boolean serachwords(char[][] grid,int row, int col, String word) {
		
        if (grid[row][col] != word.charAt(0)) 
            return false; 

        int len = word.length(); 
          
       
        for (int dir = 0; dir < 8; dir++) 
        { 
          
            int k, rd = row + x[dir], cd = col + y[dir]; 

           
            for (k = 1; k < len; k++) 
            { 
                
                if (rd >= R || rd < 0 || cd >= C || cd < 0) 
                    break; 

              
                if (grid[rd][cd] != word.charAt(k)) 
                    break; 

              
                rd += x[dir]; 
                cd += y[dir]; 
            }  

          
            if (k == len) 
                return true;  
        } 
       
        return false; 
	}
	
	public static void main(String args[]) 
    { 
            R = 3; 
            C = 13; 
            char[][] grid = {{'G','E','E','K','S','F','O','R','G','E','E','K','S'}, 
                              {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'}, 
                                {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}}; 
            FindWords(grid, new String[] {"GEEKS","EEE","TUSHAR"}); 
            System.out.println(); 
   
    } 
}

package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wordSearch {
	static Set<String> result = new HashSet<String>();
	static HashMap<String,int[]> result1 = new HashMap<String, int[]>();
	
	public static void main(String args[]) 
    { 
          
            char[][] grid = { {'A','B','C','D'}, 
                              {'P','R','A','T'},
                              {'K','I','T','A'},
                              {'A','N','D','Y'}}; 
            findWords(grid, new String[] {"ANDY","CAT","DOG"}); 
            System.out.println(); 
   
    } 
	
    public static void findWords(char[][] board, String[] words) {
       
        Trie trie = new Trie();
        for(String word: words){
            trie.insert(word);
        }
 
        int m=board.length;
        int n=board[0].length;
 
        boolean[][] visited = new boolean[m][n];
 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               dfs(board, visited, "", i, j, trie);
            }
        }
        
        for (Map.Entry<String, int[]> pair: result1.entrySet()) {
            System.out.println(pair.getKey() +" "+ pair.getValue()[0]+" "+pair.getValue()[1]);
        }
        
        //return new ArrayList<String>(result);
      }
    	static boolean found =false;
	   public static boolean dfs(char[][] board, boolean[][] visited, String str, int i, int j, Trie trie){
	        int m=board.length;
	        int n=board[0].length;
	        
	        if(i<0 || j<0||i>=m||j>=n){
	            return false;
	        }
	 
	        if(visited[i][j])
	            return false;
	 
	        str = str + board[i][j];
	 
	        if(!trie.startsWith(str))
	            return false;
	       
	 
	        if(trie.search(str)){
	            //result.add(str);
	           	result1.put(str, new int[] {i,j});
	           	//found = true;
	            return true;
	        }
	     
	 
	        visited[i][j]=true;
	        if(dfs(board, visited, str, i-1, j, trie)) {
	        	//result1.put(str+ board[i-1][j], new int[] {i-1,j});
	        	//return true;
	        	found = true;
	        }
	        if(dfs(board, visited, str, i+1, j, trie)) {
	        	  
	        	//result1.put(str+ board[i+1][j], new int[] {i+1,j});
	        	//return true;
	        	found = true;
	        }
	        	
	        if(dfs(board, visited, str, i, j-1, trie)) {
	        	//result1.put(str+ board[i][j-1], new int[] {i,j-1});
	        	//return true;
	        	found = true;
	        }
	        if(dfs(board, visited, str, i, j+1, trie)) {
	        	//result1.put(str+ board[i][j+1], new int[] {i,j+1});
	        	found = true;
	        }
	        //diagonal up right
	        if(dfs(board, visited, str, i-1, j+1, trie)) {
	        	//result1.put(str, new int[] {i,j});
	        	found = true;
	        }
	        //diagonal up left
	        if(dfs(board, visited, str, i-1, j-1, trie)) {
	        	//result1.put(str, new int[] {i,j});
	        	found = true;
	        }
	        //diagonal down right
	        if(dfs(board, visited, str, i+1, j+1, trie)) {
	        	//result1.put(str, new int[] {i,j});
	        	found = true;
	        }
	        
	        //diagonal down left
	        if( dfs(board, visited, str, i+1, j-1, trie)) {
	        	//result1.put(str, new int[] {i,j});
	        	found = true;
	        }
	        	        
	        if(found) {
	        	 System.out.println(i+" "+j);
	        }else {
	        	found =false;
	        }         
	        visited[i][j]=false;
	        return false;
	    }
	
}

 class TrieNode{
    public TrieNode[] children = new TrieNode[26];
    public String item = "";
    public boolean isEndOfWord = false;
}
 
 class Trie{
	    public TrieNode root = new TrieNode();
	 
	    public void insert(String word){
	        TrieNode node = root;
	        for(char c: word.toCharArray()){
	            if(node.children[c-'A']==null){
	                node.children[c-'A']= new TrieNode();
	            }
	            node = node.children[c-'A'];
	        }
	        node.isEndOfWord=true;
	        node.item = word;
	    }
	 
	    public boolean search(String word){
	    	
	    	
	        TrieNode node = root;
	        for(char c: word.toCharArray()){
	            if(node.children[c-'A']==null)
	                return false;
	            node = node.children[c-'A'];
	        }
	        
	        if(node.isEndOfWord){
	        	if(node.item.equals(word))
	        		return true;
	        	else{
		            return false;
		        }
	        }
	        return false;
	    }
	 
	    public boolean startsWith(String prefix){
	        TrieNode node = root;
	        for(char c: prefix.toCharArray()){
	            if(node.children[c-'A']==null)
	                return false;
	            node = node.children[c-'A'];
	        }
	        return true;
	    }
	}
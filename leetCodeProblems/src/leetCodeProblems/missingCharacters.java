package leetCodeProblems;
import java.util.*;
import java.lang.*;
public class missingCharacters {

  public static void main(String[] args) {
      String str="The quick brown fox jumps over the lazy";
      char s[]=str.toCharArray();
      int c[]=new int[26];
      for(int i=0;i<s.length;i++){
          if(s[i]!=' '){
              c[s[i]-'a']++;
          }
      }
      String s2="";
      for(int i=0;i<26;i++){
          if(c[i]==0){
              s2=s2+(char)(i+'a');
          }
      }
      System.out.println(s2);
  }
}
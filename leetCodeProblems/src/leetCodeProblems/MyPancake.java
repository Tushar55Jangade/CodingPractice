package leetCodeProblems;

import java.io.IOException;

public class MyPancake{


		  public static void main(String[] args){
		    int[] a = {1};
		    MyPancake t = new MyPancake();
		    t.increment(a);
		    System.out.println(a[a.length - 1]);
		  }
		  void increment(int[] i){
		     i[i.length - 1]++; 
		  }
		}
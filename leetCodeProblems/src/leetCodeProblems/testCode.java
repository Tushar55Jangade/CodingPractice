package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;
	public class testCode {
		  private static Map<String,Integer> map;

		  public testCode() {
		    map = new HashMap<>();
		    map.put("foo", 1);
		    map.put("bar", 3);
		  }

		  public static int getValue(String input, int numRetries) throws Exception {
		    try {
		    	System.out.println(map.get(input));
		      return map.get(input);
		    }
		    catch (Exception e) {
		      if (numRetries > 3) {
		        throw e;
		      }
		      return getValue(input, numRetries + 1);
		    }
		  }
		  public static void main(String[] args) throws Exception
			{

			   getValue("foo", 1);
			   getValue("bar", 2);
			   getValue("baz", 1);
			   getValue("fubar", 1);
			}
		}


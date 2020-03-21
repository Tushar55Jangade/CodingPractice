package leetCodeProblems;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
public class deviceNameSystem {
	public static void main(String args[])
	{
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("switch");
		nums.add("switch");
		nums.add("switch");
		nums.add("switch");
		nums.add("switch");
		nums.add("tv");
		nums.add("tv");
		nums.add("tv");
		nums.add("tv");
		nums.add("tv");
		myNumbers(nums);
	}
	
	public static ArrayList<String> myNumbers(ArrayList device)
	{
	    ArrayList<String> numbers = new ArrayList<String>();
	    for (Object element : device) {
            if (!numbers.contains(element))
            {
            	numbers.add((String) element);
            }
            else if(numbers.contains(element))
            {
            	String copy = element.toString();
            	int i = 0;
            	for(Object same : numbers)
            	{
            		//System.out.println(same);
            		if(numbers.contains(copy.substring(0,copy.length())))
            		{
            			System.out.println(copy);
    	    			i++;
                	}
    	    	}
            	numbers.add(element+""+i);
            }
        }
	    System.out.println(numbers);
	    return numbers;
	 }
}



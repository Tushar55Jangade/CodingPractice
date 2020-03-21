package consultAddCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOfListExample {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
    { 
		List<ArrayList<String>> userDetails = new ArrayList<ArrayList<String>>();
		ArrayList<String> detailsList = new ArrayList<String>();
		detailsList.add("ID");
		detailsList.add("Name");
		detailsList.add("Address");
		userDetails.add(detailsList);
		char ch ;
		Scanner in = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Database Of User Details\n"); 
		
		do 
		{
			System.out.println("Database Operations\n");
            
            System.out.println("1. Insert User Details");
            System.out.println("2. Delete User Details");
            System.out.println("3. Print All User Details\n"); 
            System.out.print("Enter your option:");
            
            int choice = in.nextInt();
			
            switch(choice)
            {
            	case 1:
            		
            		ArrayList<String> anotherList = new ArrayList<String>();
            		
            		System.out.println("Enter User ID");
            		String userId = userInput.nextLine();
            		anotherList.add(userId);
            		
            		System.out.println("Enter Name");
            		String name = userInput.nextLine();
            		anotherList.add(name);
            		
            		System.out.println("Enter Address");
            		String address = userInput.nextLine();
            		anotherList.add(address);
            		
            		userDetails.add(anotherList);
            		
            		break;
            	case 2:
            		System.out.println("Please Select the ID which You want to Delete");
            		for(int i=0;i<userDetails.size();i++) {
            			System.out.println(userDetails.get(i));
            		}
            		
            		System.out.println("Enter User ID");
            		String delete = userInput.nextLine();
            		userDetails.remove(Integer.parseInt(delete));
            		
            		break;
            	case 3:
            		
            		for(int i=0;i<userDetails.size();i++) {
            			System.out.println(userDetails.get(i));
            		}	
            		break;
            	default : 
                    System.out.println("Wrong Entry \n ");
                    break;
            
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = in.next().charAt(0);
		}
		while (ch == 'Y'|| ch == 'y');
    } 
}

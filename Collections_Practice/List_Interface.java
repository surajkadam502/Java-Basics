package Collections_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Interface
{
  public static void main(String[] args) 
  {
	//ArrayList<String>l1 = new ArrayList<String>();
	  
	/*ArrayList<Integer>l1 = new ArrayList<Integer>();
	l1.add(12);*/
	  
	//List l2 = new ArrayList();
	  
	  
	ArrayList List = new ArrayList();
	
	List.add(0, "Suraj");
	List.add("In"); //this will add at last
	List.add(2,"second"); //as per insertion order will be add at last, we have added it at the end of process
	List.add(1, "Ram");
	List.add(2, "Suraj");
	List.add(3, true);
	List.add(4, 2000);
	List.set(2, "Set"); //Suraj will replaced with Set
	
	for(int i=0; i<=List.size()-1;i++) 
	{
	   System.out.println(List.get(i)); //to retrive individual item
	   System.out.println(List); //to print in array format
	   
	   System.out.println(List.get(1)); //as per insertion order at start = Ram
	}
	
	Collections.shuffle(List); //sort not possible due to hetro values
	System.out.println(List);
	}
  
}

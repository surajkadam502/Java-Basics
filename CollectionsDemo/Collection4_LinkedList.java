package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection4_LinkedList {

	public static void main(String[] args)
	{
        //Declare Linked List -- can store heterogeneous values
		//LinkedList l = new LinkedList();
		//To store homogeneous values -
		//LinkedList<Integer> l1 = new LinkedList();
		//LinkedList<String> l2 = new LinkedList();
		
		LinkedList l = new LinkedList();
		
		//add element/node into LinkedList
		
		l.add(100);
		l.add("Welcome");
		l.add(15.56);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size()); //default value 10 is only for ArrayList not for LinkedList
		
		//remove
		l.remove(3);
		System.out.println("After removing new List : "+l);
		
		//by passing value
		l.remove("Welcome");
		System.out.println("After removing new List : "+l);
		
		//add element in the middle
		l.add(3,"New Element");
		l.add(4, "Java");
		System.out.println("After adding new List : "+l+ "   " +l.size());
		
		//retrieving
		l.get(3);
		System.out.println(l.get(3));
		
		//replace or change the value
		l.set(5, "Changed Element");
		System.out.println("After changing new List : "+l+ "   " +l.size());
		
		//contains -- to verify element is available or not
		l.contains("Java");
		System.out.println(l.contains("Java")); //return true if contains else false
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//to read all the data from LinkedList --for loop, iterator method, for..each loop
		//1.using for loop
		for(int i=0; i<l.size();i++) 
		{
			System.out.println(l.get(i));
		}
		
		//2.for..each loop
		for(Object e:l)  //because it consists heterogeneous values so object
		{
			System.out.println(e);
		}
		
		//Iterator method
		Iterator it = l.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}

}

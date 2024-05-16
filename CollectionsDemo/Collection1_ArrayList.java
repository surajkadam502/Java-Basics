package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1_ArrayList {

	public static void main(String[] args) 
	{
      //Declare ArrayList
	  //ArrayList al = new ArrayList(); //Class comes from java.util package allow to store heterogeneous values
	  //ArrayList<Integer> al = new ArrayList<Integer>(); Wrapper class, allows to store same data type of element (Homogeneous)
      //ArrayList<String> al = new ArrayList<String>();
		
	  //also we can create ArrayList with help of List Interface as it is parent interface
	  //List a = new ArrayList(); //import List (Java.util)
		
		ArrayList al = new ArrayList();  //Heterogeneous values will allow
		//How to add elements
		al.add(100);
		al.add(100); //duplicates allowed
		al.add("Welcome");
		al.add(15.63);
		al.add('A');
		al.add(true); //by using this add we are adding element at end of ArrayList
		
		System.out.println(al);  //in the form of array [100, 100, Welcome, 15.63, A, true]
		
		//size of an ArrayList
		System.out.println(al.size()); //6
		 
		//remove 
		al.remove(4); //with 4 index
		al.remove("Welcome"); //by direct passing element
		System.out.println(al); //'A' and "Welcome" removed , now only 4 element we have
		
		//insert a new element
		al.add(2, "New Element"); //insert with index and element
		System.out.println("After Insertion ="+al); //After Insertion =[100, 100, New Element, 15.63, true]
		
		//Retrieving specific value
		al.get(3); //al.get(index);
		System.out.println(al.get(3)); //15.63
		
		//replace with some new value
		al.set(3, "C#");
		System.out.println(al); //[100, 100, New Element, C#, true]
		
		//search value 
		System.out.println(al.contains("C#")); //returns true
		
		//isEmpty();
		System.out.println(al.isEmpty()); //false
		
		//How to read the data from ArrayList
		//1)for loop
		 System.out.println("Reading elements by using for loop");
		 for(int i=0; i<al.size(); i++) 
		 {
			 System.out.println(al.get(i)); 
		 }
		
		//2)for..each loop
		 System.out.println("Reading elements by using for..eachloop");
		 for(Object e : al)  //e will hold all kind of data objects, so Object datatype defined
		 {
			 System.out.println(e);
		 } 
		
		//3)iterator() 
		 System.out.println("Reading elements by using iterator");
		 Iterator it = al.iterator(); //Iterator class from collections (Java.util)
		 while(it.hasNext()) //it.hasNext() this method returns true if iterator having an element else flase
		 {
			 System.out.println(it.next()); //if iterator has element it will go inside and extract the element
			                                //and again will check for next element by using it.next() method 
		 }
	}

}

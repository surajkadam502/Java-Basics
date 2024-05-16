package CollectionsDemo;

import java.util.HashSet;

public class Collection8_HashSet {

	public static void main(String[] args) 
	{
       HashSet <Integer> evenNumber = new HashSet<Integer>();
       evenNumber.add(2);
       evenNumber.add(4);
       evenNumber.add(6);
       
       System.out.println("HashSet : " +evenNumber); //HashSet : [2, 4, 6]
      //addAll ()
       HashSet<Integer> numbers = new HashSet<Integer>();
       numbers.addAll(evenNumber);
       numbers.add(10);
       System.out.println("New HashSet : "+numbers); //New HashSet : [2, 4, 6, 10]
	  
      //removeAll()
       numbers.removeAll(evenNumber);
       System.out.println("After removing : "+numbers); //After removing : [10]
	}

}

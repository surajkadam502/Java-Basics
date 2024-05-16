package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Collection7_HashSet {

	public static void main(String[] args) 
	{
     // HashSet hs = new HashSet(); //default initial capacity 16; load factor 0.75
      
     // HashSet hs = new HashSet(100); // initial capacity changed to 100 locations
     
	 //	HashSet hs = new HashSet(100,(float)0.95); //now Initial capacity is 100 with load factor 0.95-->>typecast to float
	
	 //	HashSet<Integer> hs = new HashSet<Integer>(); //Wrapper class
		
		HashSet hs = new HashSet(); //it doesnt have its own methods, so it implements all set methods
	 
		//add objects/elements into HashSet
		hs.add(100);
		hs.add("Suraj");
		hs.add('A');
		hs.add(null);
		hs.add(16.52);
		hs.add(false);
		System.out.println(hs); //insertion order will not followed [null, Suraj, A, 100, false, 16.52]
		
		//remove
		hs.remove(false); //no indexing concept so pass value directly
		System.out.println(hs);
		
		//we dont have get and set methods directly into HashSet so need to use - for..each loop or iterator
		
		//contains
		System.out.println(hs.contains("Suraj")); //--case sensitive
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		//Reading objects from HashSet using for..each loop , cant use for loop
		
		for(Object e : hs) 
		{
			System.out.println(e);
		}
		
		//Iterator method
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}

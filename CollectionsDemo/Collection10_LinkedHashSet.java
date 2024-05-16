package CollectionsDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Collection10_LinkedHashSet {

	public static void main(String[] args) 
	{
          //HashSet and LinkedHashSet are equal to each other only difference is Insertion order will be preserved in LinkedHashSet
		
        HashSet set = new HashSet();
		
		set.add(1);
		set.add(200);
		set.add(3);
		set.add(400);
		set.add(5);
		System.out.println(set); //observe insertion order [400, 1, 3, 5, 200]
		
        LinkedHashSet <Integer> set1 = new LinkedHashSet<Integer> ();
		
		set1.add(1);
		set1.add(2);
		set1.add(300);
		set1.add(4);
		set1.add(5);
		set1.add(null);
        System.out.println(set1);//observe insertion order[1, 2, 300, 4, 5]
        
        //remaining all methods will be same as of HashSet
        
        
	}

}

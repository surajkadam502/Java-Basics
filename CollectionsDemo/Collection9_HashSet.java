package CollectionsDemo;

import java.util.HashSet;

public class Collection9_HashSet {

	public static void main(String[] args) 
	{
     //Union , Intersection , Difference
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println("Hashset 1 : " +set);
		
HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("Hashset 2 : " +set1);
		
		/*//Union -- print only unique values , duplicates will remove from set1
		set.addAll(set1);
		System.out.println("Union Rsult : "+set);
		
		//intersection --only common elements
		set.retainAll(set1);
		System.out.println("Intersection Rsult : "+set);
		
		//difference
		set.removeAll(set1);
		System.out.println(set);*/
		
		//set1 is subset of set or not  -->>true or false
		System.out.println(set.containsAll(set1));
		
	}

}

package CollectionsDemo;

import java.util.Hashtable;

public class Collection14_HashTable {

	public static void main(String[] args) 
	{
         Hashtable t3 = new Hashtable(); //Default capacity 11, load factor=0.75
         Hashtable t1 = new Hashtable(25); // change capacity
         Hashtable t2 = new Hashtable(26 , (float) 0.76); // change capacity with load factor
	     Hashtable <Integer,String> t = new Hashtable <Integer,String>();
	     
	     t.put(01, "Suraj");
	     t.put(02, "Ram");
	     t.put(03, "Seeta");
	     t.put(03, "Mahesh"); //"Seeta" will replaced with new value "Mahesh" having same key
	     //t.put(null, "Sara"); //NullPointerException - null not allowed either in key or value
	     //t.put(04, null); ////NullPointerException - null not allowed either in key or value
	     
	     //System.out.println(t); //{3=Mahesh, 2=Ram, 1=Suraj} -- Insertion Order not preserved
	     //System.out.println(t.get(02)); //Ram
	     //t.remove(01); //Suraj
	     //System.out.println("After removing = "+t); //After removing = {3=Mahesh, 2=Ram}
	     
	     //System.out.println(t.containsKey(02));//true -- 02 available
	     //System.out.println(t.containsKey(102)); //false -- 102 not availabe
	     
	     //System.out.println(t.containsValue("Ram")); //true -- "Ram" available
	     //System.out.println(t.containsValue("Ram Hanuman")); //false -- "Ram Hanuman" not available
	     
	     System.out.println(t.isEmpty()); //false -- we have data inside 
	     
	     System.out.println(t.keySet()); //will return all the keys from Hashtable - [3, 2, 1]
	     System.out.println(t.values()); //will return all the values from Hashtable - [Mahesh, Ram, Suraj]
	}

}

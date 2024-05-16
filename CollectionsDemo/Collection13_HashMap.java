package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection13_HashMap {

	public static void main(String[] args) 
	{
         //HashMap m = new HashMap(); //heterogeneous allowed
		//Map<String,Integer> m1 = new HashMap<String,Integer>();
         
        HashMap<String,Integer> m = new HashMap<String,Integer>();
         
         m.put("Maths",98);
         m.put("Science", 100);
         m.put("SocialSci",90);
         m.put("Geography", 92);
         m.put("Marathi",96);
         m.put("Hindi", 89);
         m.put("Marathi", 99); //old value replaced with new value {Geography=92, Maths=98, Science=100, Marathi=99, Hindi=89, SocialSci=90}
                               //Value can be duplicated but key should be unique
                               //Only one null key is allowed , values can have multiple nulls
         System.out.println(m); //{Geography=92, Maths=98, Science=100, Marathi=96, Hindi=89, SocialSci=90}
         
         System.out.println(m.get("Marathi")); //99 - new value will be fetched
         
         m.remove("Maths"); //1st record will remove having key "Maths"
         System.out.println(m); //{Geography=92, Science=100, Marathi=99, Hindi=89, SocialSci=90}
         
         System.out.println(m.containsKey("Hindi")); //true -- present
         System.out.println(m.containsKey("Maths")); //false -- as its not present removed
         
         System.out.println(m.containsValue(96)); //false as 96 is replaced with 99 so showing false
         System.out.println(m.containsValue(92)); //true -- Value is assigned to key "Geography"
         
         System.out.println(m.isEmpty()); //false -- because it contains some data
         
         System.out.println(m.keySet()); //return all the keys as Set collection - [Geography, Science, Marathi, Hindi, SocialSci]
         
         System.out.println(m.values()); //return all values as collection - [92, 100, 99, 89, 90]
         
         //Entry set
         System.out.println(m.entrySet());//This will return all the entries as Set - [Geography=92, Science=100, Marathi=99, Hindi=89, SocialSci=90]
         
         
         //to read each entry as individual object
         
         for(Object i : m.keySet())  //need to mention type of key and value - Integer or STring
         {
        	 System.out.println("Individual entry of Keys :  "+i);
         }
         
         for(Object i : m.values())  //need to mention type of key and value - Integer or STring , else mention Object
         {
        	 System.out.println("Individual entry of values :  "+i);
         }
         
         //both key and values wants to print side by side , one by one
         
         for(Object i:m.keySet()) 
         {
        	 System.out.println(i+" = "+m.get(i)); //from key set it will print key first and then from get method it will print value assigned to that key
        	 
         }
         
         
       //Entry Interface - to work on particular entry
         //Child interface of Map interface -- 101 x -- actions on single entry
         
         for(Map.Entry entry :m.entrySet())  //return all the entries keys and values
        	                                 //see declaration <String, Integer>
         {
        	 System.out.println("SecondLoop  "+entry.getKey()+"   "+entry.getValue());
         }
         
         //by using Iterator Method -
         Set s = m.entrySet(); //will store all entries in RT = Set s -->> converted to Set
         Iterator itr = s.iterator();
         while(itr.hasNext()) 
         {
        	 Map.Entry entry = (Entry)itr.next();
        	 System.out.println(entry.getKey()+"  "+entry.getValue());
         }
         
	}

}

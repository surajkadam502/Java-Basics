package CollectionsDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Collection11_PriorityQueue {

	public static void main(String[] args)
	{
		//Heterogeneous data not allowed
		
       PriorityQueue q = new PriorityQueue();
       
       //Adding elements -->> add() , offer() 
       
       q.add("A");
       q.add("Z");
       q.add("C");
       q.add("A");
       q.offer("Welcome");
       q.offer("C");
       System.out.println(q); //[A, A, C, Z, Welcome, C] -Duplicates allowed and The insertion order is not retained in the PriorityQueue
                             //The elements are stored based on the priority order which is ascending by default.
       //To get head element -- element()  peek()
       
       //System.out.println(q.element()); //A  if queue is empty it will throw exception (No such element exception)
       //System.out.println(q.peek()); //A  if queue is empty it will throw null
       
       //return and remove element from queue  remove()  poll()
       //System.out.println(q.remove()); //A  return and removed , if queue is empty it will throw exception
       //System.out.println("After removing: "+q); //[A, C, C, Z, Welcome]
       
       //System.out.println(q.poll()); //A return and removed , if queue is empty it will throw null
       //System.out.println(q); //[C, Welcome, C, Z]
       
       Iterator itr = q.iterator();
       while(itr.hasNext()) 
       {
    	   System.out.println(itr.next());
       }
       
       for(Object elements :q) 
       {
    	   System.out.println(elements); 
       }
	}

}

package CollectionsDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Collection12_QueueLinkedList {

	public static void main(String[] args) 
	{
		LinkedList q = new LinkedList();
	       
	       //Adding elements -->> add() , offer() 
	       
	       /*q.add("A");
	       q.add(10);
	       q.add("C");
	       q.add(12.5); //heterogeneous data allowed
	       q.offer("Welcome");
	       q.offer("C");
	       q.offer("C");
	       System.out.println(q);*/ //Insertion order preserved, duplicates allowed
	       
	     //To get head element -- element()  peek()
	       
	       //System.out.println(q.element()); //A  if queue is empty it will throw exception (No such element exception)
	       //System.out.println(q.peek()); //A  if queue is empty it will throw null
		
		   //System.out.println(q.remove()); //A  return and removed , if queue is empty it will throw exception
	       //System.out.println("After removing: "+q); //[A, C, C, Z, Welcome]
	       
	       System.out.println(q.poll()); //A return and removed , if queue is empty it will throw null
	       System.out.println(q); //[C, Welcome, C, Z]
	}

}

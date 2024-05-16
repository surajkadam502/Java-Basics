package CollectionsDemo;

import java.util.LinkedList;

public class Collection6_LinkedList {

	public static void main(String[] args) 
	{
      //special methods of LinkedList -- for Stack and Queue interfaces
		
		LinkedList l = new LinkedList();
		l.add("Dog");
		l.add("Dog");
		l.add("Horse");
		l.add("Cat");
		l.add("Lion");
		
		System.out.println(l); //[Dog, Dog, Horse, Cat, Lion]
		
		//Add first --Add new element at first node
		l.addFirst("New Dog");
		
		//Add Last --Add new element at Last node
		l.addLast("New Lion");
		
		System.out.println(l); //[New Dog, Dog, Dog, Horse, Cat, Lion, New Lion]
		System.out.println(l.get(5)); //Lion
		System.out.println(l.getFirst()); //New Dog
		System.out.println(l.getLast()); //New Lion
		l.removeFirst();
		l.removeLast();
		System.out.println(l); //[Dog, Dog, Horse, Cat, Lion]
	}

}

package CollectionsDemo;

import java.util.Collections;
import java.util.LinkedList;

public class Collection5_LinkedList {

	public static void main(String[] args)
    {
		LinkedList l = new LinkedList();
		
		//sorting and shuffling possible with only homogeneous data
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		LinkedList new_l = new LinkedList();
		//addAll
		new_l.addAll(l);
		System.out.println(new_l); //[x, y, z, a, b, c]
		
		//removeAll
		new_l.removeAll(l);
		System.out.println(new_l); //[]
		
		//collections class methods for sorting and shuffling
		Collections.sort(l);
		System.out.println("After Sorting : "+l); //After Sorting : [a, b, c, x, y, z]
		
		Collections.reverse(l);
		System.out.println("After Reversing : "+l); //After Reversing : [z, y, x, c, b, a]
		
		Collections.shuffle(l);
		System.out.println("After Shuffling : "+l); //After Shuffling : [a, x, y, b, c, z]

		//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After Reversing Order : "+l);
		
	}

}

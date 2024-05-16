package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Collection2_ArrayList {

	public static void main(String[] args) 
	{
      ArrayList al = new ArrayList();
      al.add("X");
      al.add("Y");
      al.add("Z");
      al.add("H");
      al.add("E");
      al.add("F");
      al.add("F");
      
      ArrayList al_Duplicate = new ArrayList();
      al.add("X");
      al.add("Y");
      al.add("Z");
      al.add("a");
      al.add("b");
      al.add("c");
      al.add("F");
      
      //we have to add these all into another ArrayList
      
      
      al_Duplicate.addAll(al);
      System.out.println("New Array = "+al_Duplicate); //New Array = [A, B, C, D, E, F]
      
      /*to remove
      al_Duplicate.removeAll(al);
      System.out.println(al_Duplicate);     //[]*/
      
      //sort an Array --- use methods from collections class from java.util
      Collections.sort(al_Duplicate);
      System.out.println("After Sorting = " +al_Duplicate);
      
      //Reverse order sorting - nested collections methods
      Collections.sort(al_Duplicate,Collections.reverseOrder());
      System.out.println("After Reverse Sorting = " +al_Duplicate);

      //Shuffling --collections.shuffle()
      Collections.shuffle(al_Duplicate);
      System.out.println("After Shuffling ="+al_Duplicate);
      
      Collections.reverse(al_Duplicate);
      System.out.println(al_Duplicate);
      
        
	}

}

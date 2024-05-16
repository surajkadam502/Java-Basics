package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection3_ArrayList {

	public static void main(String[] args) 
	{
        String[] arr = {"Dog","Cat","Elephant"};
        for (String value:arr) //to read values
        {
        	System.out.println(value);
        }
        
        //convert array to ArrayList
        ArrayList al = new ArrayList(Arrays.asList(arr)); // ArrayList -- collections java.util
                                                          // Arrays.asList(arr) -- collections java.util
        System.out.println(al);
	}

}

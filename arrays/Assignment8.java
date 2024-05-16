package arrays;

import java.util.Arrays;

public class Assignment8 {

	public static void main(String[] args)
	{
		//repeat function
		String z = "Suraj";
		z.repeat(5);
		System.out.println(z.repeat(5));	
		
		String name []= new String[5]; //trial to print "Suraj" five times
		name [0]= "Suraj";
		name [1]= "Suraj";
		name [2]= "Suraj";
		name [3]= "Suraj";
		name [4]= "Suraj";
		
		for (int i = 0; i<=4 ; i++) 
		{
			System.out.println(name[i]);
		}
		
		//Split Function
		String s1 = "My:Name:Is:Manish";
		String s2[]= s1.split(":"); //will remove : and add , and keep it in array
		System.out.println(Arrays.toString(s2));
		System.out.println(s2[3]);  //here indexing is considered for each word not for each character
	}

}

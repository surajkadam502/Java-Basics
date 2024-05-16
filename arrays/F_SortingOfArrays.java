package arrays;

import java.util.Arrays;

public class F_SortingOfArrays {

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		name[0] = "Suraj";
		name[1] = "Dhiraj";
		name[2] = "Rahul";
		for(int i =0; i<=2; i++) 
		{
			System.out.println(name[i]); //here answer will print separately 
		}
		System.out.println(Arrays.toString(name));	//here sorting will be done [a'b'c]
		Arrays.sort(name); //to sort in sequence
		System.out.println(Arrays.toString(name));
	}

}

package arrays;

import java.util.Arrays;

public class B_BasicsArrays 
{
	public static void main(String[] args)
	{
		String[] name = new String[4];
		name[0] = "Suraj";
		name[1] = "Supriya";
		name[2] = "Sara";
		name[3] = "Ganesh";
		
		for(int i=0; i<=3; i++) 
		{
			System.out.println(name[i]); //One after another
		}
		
		System.out.println(Arrays.toString(name));  //in array format
	}
}

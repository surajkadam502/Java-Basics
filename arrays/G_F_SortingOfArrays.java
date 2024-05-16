package arrays;

import java.util.Arrays;

public class G_F_SortingOfArrays 
{
	public static void main(String[] args)
	{
		int rollno [] = new int[4];
		rollno[0] = 10;
		rollno[1] = 5;
		rollno[2] = 20;
		rollno[3] = 0;
		
		System.out.println(Arrays.toString(rollno)); //without sorting & converted to String
		Arrays.sort(rollno); //Sorting ASC
		System.out.println(Arrays.toString(rollno)); //with sorting and converted to String
	}
}

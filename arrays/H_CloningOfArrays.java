package arrays;

import java.util.Arrays;

public class H_CloningOfArrays 
{
	public static void main(String[] args)
	{
		int rollno [] = new int[4];
		rollno[0] = 10;
		rollno[1] = 5;
		rollno[2] = 20;
		rollno[3] = 0;
		
		int Rn []=new int [4];
		
		for (int i=0; i<=3; i++) 
		{
			Rn[i]=rollno[i];
			System.out.println(Rn[i]);
			//System.out.println(rollno[i]); -->>both values will be same
		}
		System.out.println(Arrays.toString(Rn));
	}
}

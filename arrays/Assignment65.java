package arrays;

import java.util.Arrays;

public class Assignment65 {

	public static void main(String[] args)
	{
        int rollno []= {12,14,16,20};
        
        int rollno1 []= new int [4];
        
        for (int i=0;i<=3;i++ ) 
        {
        	rollno1[i]= rollno[i];
        }
        System.out.println(Arrays.toString(rollno1));
	}

}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class D_BasicsUsingScannerClass 
{
  public static void main(String[] args) 
  {
	int rollno[]= new int[4];
	  for (int i=0; i<=3; i++) 
	  {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter values of Index :"+i);
		  rollno[i]= sc.nextInt(); //upto this enter values in console
	  }
	System.out.println(rollno[0]);  // to print entered values
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);
	System.out.println(rollno[3]);
	System.out.println(Arrays.toString(rollno));
  }
}

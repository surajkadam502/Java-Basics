package exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner (System.in);
	
	try 
	{
		System.out.println("Enter value of a");
		int a = sc.nextInt();	//other than int value = input mismatch
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Correct Input"+" "+c);
	}
	catch (InputMismatchException f) 
	{
		System.out.println("InputMismatchException Handled");
	}
	System.out.println("Is India expensive country? ");
	System.out.println("Enter your Answer");
	    boolean z = sc.nextBoolean();
	    System.out.println("No exception");
  }
}

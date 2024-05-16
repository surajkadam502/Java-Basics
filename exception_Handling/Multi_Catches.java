package exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi_Catches 
{
  public static void main(String[] args)
  {
	try 
	{  
	System.out.println("Enter answer of your marriage status");	
	Scanner sc = new Scanner (System.in);
	boolean areyoumarried = sc.nextBoolean();
	System.out.println("True");
	}
    catch (ArithmeticException k) 
    {
	  System.out.println("Its Arithmetic Exception");
    }
	catch (InputMismatchException h) 
    {
	  System.out.println("Its InputMismatchException");
    }
	catch (NullPointerException  g) 
    {
	  System.out.println("Its NullPointerException ");
    }
}
}

//1.Use all methods of Scanner class


	
  /*static void first5()
  {
	  Scanner x1 = new Scanner(System.in);
	  System.out.println("Enter a");
	  int a = x1.nextInt();
	  System.out.println("Enter b");
	  byte b = x1.nextByte();
	  System.out.println("Enter c");
	  short c = x1.nextShort();
	  System.out.println("Enter d");
	  long d = x1.nextLong();
	  System.out.println("Enter e");
	  float e = x1.nextFloat();  
	  
  }
  public static void main(String[] args) 
  {  
	  Scanner x2 = new Scanner(System.in);
	  System.out.println("Enter f");
	  boolean f = x2.nextBoolean();
	  System.out.println("Enter g");
	  double g = x2.nextDouble();
	  System.out.println("Enter h");
	  String h = x2.next();
	  first5();	 
  }*/
	
package veriables;
import java.util.Scanner;
public class A6_AssignmentScannerClass 
{
	public static void add() 
	{
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Addition = ");
		        System.out.println("Enter value of a");
				int a = s1.nextInt();
				System.out.println("Enter value of b");	
				int b = s1.nextInt();
				int c = a+b;
				System.out.println("Addition ="+c);			
	}
	
	public static void sub() 
	{
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Subtraction = ");
		        System.out.println("Enter value of x");
				int x = s1.nextInt();
				System.out.println("Enter value of y");	
				int y = s1.nextInt();
				int z = x-y;
				System.out.println("Subtraction ="+z);			
	}
	
	void mul() 
	{
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Multiplication = ");
		        System.out.println("Enter value of x");
				int x = s1.nextInt();
				System.out.println("Enter value of y");	
				int y = s1.nextInt();
				int z = x*y;
				System.out.println("Multiplication ="+z);			
	}
	
	 void div() 
	{
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Division = ");
		        System.out.println("Enter value of a");
				int a = s1.nextInt();
				System.out.println("Enter value of b");	
				int b = s1.nextInt();
				int c = a/b;
				System.out.println("Division ="+c);			
	}
	
	 public static void main(String[] args) 
	 {
		System.out.println("Results = ");
		add();
		sub();
		
		A6_AssignmentScannerClass z1 = new A6_AssignmentScannerClass();
		z1.mul();
		z1.div();
	 }		
}

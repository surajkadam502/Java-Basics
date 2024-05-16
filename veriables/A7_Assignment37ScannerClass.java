// Declare variable globally


package veriables;
import java.util.Scanner;
public class A7_Assignment37ScannerClass 
{
   int a;
   int b;
   int result;
   
   Scanner gc = new Scanner (System.in);  //declare both variables and scanner class globally
   
   void add() 
   {  
	  System.out.println("Addition =");
	  System.out.println("Enter value of a");
	  a = gc.nextInt();
	  System.out.println("Enter value of b");
	  b = gc.nextInt();
	  result = a+b ;
	  System.out.println("Addition Result ="+result);
   }
   
   void sub() 
   {  
	  System.out.println("Subtraction ="); 
	  System.out.println("Enter value of a");
	  a = gc.nextInt();
	  System.out.println("Enter value of b");
	  b = gc.nextInt();
	  result = a-b ;
	  System.out.println("Subtraction Result ="+result);
   }
   
   void mul() 
   {  
	  System.out.println("Multiplication ="); 
	  System.out.println("Enter value of a");
	  a = gc.nextInt();
	  System.out.println("Enter value of b");
	  b = gc.nextInt();
	  result = a*b ;
	  System.out.println("Multiplication Result ="+result);
   }
   
   void div() 
   {  
	  System.out.println("Division ="); 
	  System.out.println("Enter value of a");
	  a = gc.nextInt();
	  System.out.println("Enter value of b");
	  b = gc.nextInt();
	  result = a/b ;
	  System.out.println("Division Result ="+result);
   }
   
   public static void main(String[] args) 
   {
	   A7_Assignment37ScannerClass z1 = new A7_Assignment37ScannerClass();
	   z1.add();
	   z1.sub();
	   z1.mul();
	   z1.div();
   }
}
   
   /* static void mul() 
   {
	   System.out.println("Multiplication =");
	   A7_Assignment37ScannerClass Obj1 = new A7_Assignment37ScannerClass();
	   Obj1.a =
   }*/


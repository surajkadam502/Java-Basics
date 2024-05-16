//Assignment - Call any two static and non-static method inside main method

package package1alwayslowercase;

public class B6AssignmentOnMethodCalling 
{
   public static void Add() 
   { 
	   int a = 20;
	   double b = 15.23;
	   double c = a + b;
	   System.out.println(c);   
   }
   
   public static void Sub() 
   { 
	   int a = 20;
	   double b = 15.23;
	   double c = a - b;
	   System.out.println(c);   
   }
   
   public void Multi() 
   { 
	   int a = 20;
	   double b = 15.23;
	   double c = a * b;
	   System.out.println(c);   
   }
   
   public void Div() 
   { 
	   int a = 5;
	   int b = 7;
	   double c = a / b;
	   System.out.println(c);   
   }
   
   public static void main(String[] args) 
   {
	   System.out.println("These are the answers");
	   B6AssignmentOnMethodCalling x = new B6AssignmentOnMethodCalling();
	   x.Multi();
	   x.Div();
	   Add();
	   Sub();   
   }
}

package veriables;

import java.util.Scanner;

public class A9_Assignment39ScannerIf 
{
   void vote() 
   {
	   int age;
	   Scanner m1 = new Scanner(System.in);
	   age= m1.nextInt();   //if age is not declared above then int age=m1.nextInt(); can use
	   
	  
	   if(age>18) 
		 
	   {
	     System.out.println("I can Vote");
	   }
	   else 
	   {
		 System.out.println("I can't Vote");
	   }
   }
   public static void main(String[] args) 
   {   
	   System.out.println("Enter age");
	   A9_Assignment39ScannerIf o = new A9_Assignment39ScannerIf();
	   o.vote();
}
}

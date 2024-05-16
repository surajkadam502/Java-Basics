/*Variable Concept-
  int a = 6800 ; initialization & Declaration
  int a ; declaration
  a = 6800; initialization
  
  (Arithmetic Operators - +,-,*,/)
  (If variable will be inside the main method - Local(brown)
   if variable will be inside class and outside of main method - Global(blue))
  
  Conditional Operators - 
  (> - Greater than
   < - Less than
   >= - Greater than or equals to
   <= - Less than or equals to
   == - Equals to equals to 
   ! - Not equals to)
   
   Conditional Statement-
   1. if block / if statement
   Syntax - 
   if (Condition)  //if = keyword
   {
   }*/

package package1alwayslowercase;

import java.util.Scanner;

public class A7ConditionalStatements 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		  /*if first condition will True then it will not execute else
		                   block , it will print answer
		                   if first condition will be false then only it will execute
		                   else block*/
		
				  if (age >= 18)
				  {
					  System.out.println("I can vote!");
				  }
				  else
				  { 
					  System.out.println("I can't vote!");
				  }
				  
		
	}
}
  
	  
		  


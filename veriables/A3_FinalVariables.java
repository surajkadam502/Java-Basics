/* Final Variable
  - any variable which is fixed, can't change its value
  - Local & Global both variable can be fixed
  - Whichever variable wants to be fixed throghout the class,Make it final in class
  - Syntax 
    void add
    {
     final int a = 20;   _____Correct
               a = 200;  _____Can't be done
  - If using final Variable don't initiate it again inside the method            
    }
*/

// Assignment - Find the area of circle pi=3.14
package veriables;

public class A3_FinalVariables 
{
   final static double pi = 3.14;
   
   static void AreaOfCircle() 
   {
	   int r = 14;
	   double area = pi*r*r ;
	   System.out.println("Area of Static Circle="+area);  
   }
   public static void main(String[] args) 
   {  
	  AreaOfCircle();
	  final int r = 7;  //global variable can be finalized
	  double area = pi*r*r;
	  System.out.println("Area of main Circle="+area);
   }
   
}

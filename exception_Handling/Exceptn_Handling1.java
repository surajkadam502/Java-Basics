/* Exception Handling
  1. Arithmetic Exception - 
    if int a = 1; b=0; c=a/b --- not possible 
    infinite value can't be store inside the int datatype so its nothing but exception
  2. Points to remember -
    A) Exception Handling can be done by using two keywords try and catch
    B) Whichever line is giving exception, should be inside the 'try' block & exception must be handled by 'catch' block
    C) After writing a code of try and catch, if exception is coming then try block will not execute but catch block
       will execute.
    D) After writing a code of try and catch, if exception is not coming then try block will execute but catch block
       will not execute.
    E) For every single try block there can be single catch block or multiple catches blocks
    F) Syntax - 
        try
        {
        }
        catch (exception name  ref.variable)
        {
        }
       */

package exception_Handling;

public class Exceptn_Handling1 
{
  void EH()
  {
	  int a = 1;
	  int b = 0;
	  
	  try 
	  { 
	   int c=a/b;   //exception occures in this line
	   System.out.println(c);  
	  }
	  catch (ArithmeticException  x)  //name of exception and ref.variable
	  {
		  System.out.println("Handled");
	  }  
  }
  public static void main(String[] args) 
  {
	  Exceptn_Handling1 d1 = new Exceptn_Handling1();
	  d1.EH();
  }
}

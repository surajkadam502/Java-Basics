package exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Multi_EH 
{
  int a;
  int b;
  boolean c;
  Scanner s1 = new Scanner (System.in);
  
  void  add () 
  {   
	  System.out.println("Enter Value of A and B");
	  a= s1.nextInt();
	  b = s1.nextInt();
	  System.out.println(a+b);
	  try {
		  System.out.println("Enter Boolean Value");	  
	      c = s1.nextBoolean();
	      System.out.println(c);}
	  
	  catch (InputMismatchException d) 
	  {
		  System.out.println("Boolean should have only True and false values");
	  }  
  }
  public static void main(String[] args) 
  {
	Multi_EH m1 = new Multi_EH ();
	m1.add();	
  }
}

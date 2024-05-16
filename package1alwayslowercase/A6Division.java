package package1alwayslowercase;

public class A6Division
{
   public static void main(String[] args)
   {
	int a = 15;
	int b = 3;
	int c = a/b;
	
	System.out.println(c);
	divi();   //static method calling
	}
   
   public static void divi() 
   {
	   int a = 20;
	   int b = 5;
	   int c = a/b;
	   
	 System.out.println(c);		  	
   }
}

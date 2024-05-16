package package1alwayslowercase;

public class A4Subtraction 
{
	public static void sub()     //static method
	{
        int c = 500;
        int d = 250;
        int e = c-d;
        System.out.println(e);
        
	}
	public static void main(String[] args) //main method
	{
		int a = 10;
		int b = 20;
		int c = a-b;
		
		System.out.println(c);   //regular method
		
		sub();                   //static method calling
							
	}
	
}

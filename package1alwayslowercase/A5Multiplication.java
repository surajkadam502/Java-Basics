//multiplication by static method calling

package package1alwayslowercase;

public class A5Multiplication 
{

	public static void multi()              //static method
	{
		int a = 2;
		int b = 3;
		int c = a*b ;
		
		System.out.println(c);
	}
	
	public static void main(String[] args)  //main method 
	{
		multi();                            //static method calling inside main method
	}
}

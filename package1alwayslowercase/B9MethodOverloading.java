/*Method overloading -
   Developing multiple methods with same method name but difference in argument is nothing but method overloading
   can overload static as well as non-static methods which have return type  
 */
package package1alwayslowercase;


public class B9MethodOverloading
{
	
	public void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	public void add(double b)
	{
		System.out.println(b);
	}
	
	public static void add(char a) 
	{
		System.out.println(a);
	}
	public void add(boolean a) 
	{
		System.out.println(a);
	}
		
	public void add(String a) 
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		B9MethodOverloading s=new B9MethodOverloading();
		s.add(15, 15);
		s.add(58.5);
		s.add(false);
		s.add("Temba Bavuma");
		add('x');	
	}	
}

	
	

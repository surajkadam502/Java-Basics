/* Constructor Overloading
  - Developing multiple constructor but variation into argument list
  - if constructor is non-para call it by general method by creating object and variable (if have nonstatic method too)
  - if constructor is para then pass arguments into signature()  
  */

package package1alwayslowercase;

public class C1ConstructorOverloading 
{
	C1ConstructorOverloading ()
	{
		int a = 25;
		int b = 75;
		int c = a+b;
		System.out.println("First Non Para Constructor only by object creation"+"  "+c);
	}
	
	C1ConstructorOverloading (char x)
	{
		int a = 25;
		int b = 75;
		int c = a+b;
		System.out.println("First1 Non Para Constructor"+c);
	}
	
	C1ConstructorOverloading (int d)
	{
		int a = 25;
		double b = 75.1254;
		double c = a+b;
		System.out.println("Second Para Constructor"+c);
	}
	void C1ConstructorOverloading ()    //non static method 
	{
		boolean a = true;
		System.out.println(a);
	}
	
	void C1ConstructorOverloading (int c)    //non static method 
	{
		boolean a = false;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		C1ConstructorOverloading x = new C1ConstructorOverloading(); //only by creating object constructor will be called(nonpara)
		x.C1ConstructorOverloading(10);  // non static method - Para
		x.C1ConstructorOverloading();    // non static method - non para
		new C1ConstructorOverloading(2); //constructor calling
		new C1ConstructorOverloading('c');
	}
}

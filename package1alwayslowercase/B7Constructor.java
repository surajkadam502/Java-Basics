/*Constructor - 
  1. This is special type of method which do not have return type
  2. It is always non static
  3. Constructor name will be always same as Class name
  4. It will definitely have Access Specifier like public,protected,private,package/default
  5. Syntax - Class Hello
              {
               Hello()_______ // Constructor
               {
                }
              }
  6. If signature is empty - () = Non-Para method
     If signature has Value or argument - (int a) = Para method 
  7. Constructor gets called as soon as an object is created  
  8. Syntax of object creation - 
     Class name x = new Class name (); ____ if you have non-static method too
     new Class name (); ___________________ if you have only Constructor           
*/

package package1alwayslowercase;

public class B7Constructor 
{
	B7Constructor()             //Constructor(Non-Para)
	{
		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println(c);
	}
	
	B7Constructor(int a)
	{
		System.out.println("Constructor Overloading");
	}

class addition1{
	addition1()
	{
		int a = 10;
		int c = 25;
		int h = a+c;
		System.out.println(h);
	}
	}
	public void Div()  //Non-static method
	{
		int a = 5;
		int b = 7;
		float c  = a / b  ;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Constructor is executed");
		B7Constructor x = new B7Constructor(); //object created-constructor will call automatically
		x.Div();   //Non - Static method calling
		// new B7Constructor(); - No need of this ,as object is already created so 12 will be printed once
		new B7Constructor();
		new B7Constructor(10); 
		
		B7Constructor x1 = new B7Constructor(); //can do this 12 will print again
		
	}
}

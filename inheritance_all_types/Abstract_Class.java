//Abstract Class -
/* 1. Any class which has abstract method into it = Abstract Class
   2. Syntax -
      abstract class Suraj
      {
      }
      - Abstract class can have Concrete method with Implementations {}
      - Abstract class can have both Static as well as Non-Static methods 
        (If some logic wants to display then only)
        
   3. Abstract Method - 
      Syntax -
      abstract void suraj();  
      - No Implementation i.e {}
      - Always Non-static
      - Ends with the semicolon i.e.;  
      - Used to only show abstract method
      - No logic is present inside the Method 
      
   4. Concrete Method - Which has Implementation i.e {}
      Syntax -
      void add ()
      {
      }
      - Concrete methods can be Static as well as Non-Static
      - Logic will be present inside concrete method
      - Concrete class = which has Concrete method
      
 Note - In child class we can never have abstract method
      - Use extends keyword then mouse hover over the child class name and select
        'Add unimplemented methods', it will add same Non-static methods as we have in abstract class
      - we can manually also add those methods  
      - Then simply call Non-static methods by creating object of child class
      - Simply call ststic method by its method name
      - Only abstract method's unimplemented methods will be created, not for static as well as non-static
        method's even if they are present inside the abstract class */


package inheritance_all_types;

import java.util.Scanner;

abstract class ABS
{
	abstract void add();  //abstract methods are only for showing purpose - no logic inside
	abstract void mul();  //Logic will be inside child class methods = concrete methods with implementations
	abstract void div();
	
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	static void sum() 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Local e =");
		int e = ss.nextInt();
		System.out.println("Local f =");
		int f = ss.nextInt();
		int g = e + f;
		System.out.println("Local Sumation"+g);  //abstract class can have static method with implementations {}
	}
	void end() 
	{
		System.out.println("Global a =");
		a=sc.nextInt();
		System.out.println("Global b =");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Global Sumation"+c);  //abstract class can have Non-static method with implementations {}
	}
}

public class Abstract_Class extends ABS  //child class created 1st
{
	void add() 
	{
		System.out.println("Global a1 =");
		a=sc.nextInt();
		System.out.println("Global b1 =");  
		b=sc.nextInt();
		c=a+b;
		System.out.println("Global Sumation"+c);
		System.out.println("Unimplemented Method 1st");	
	}
	void mul()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Local e1 =");
		int e1 = ss.nextInt();
		System.out.println("Local f1 =");
		int f1 = ss.nextInt();
		int g1 = e1 + f1;
		System.out.println("Local Sumation"+g1);
		System.out.println("Unimplemented Method 2nd");	
	}
	void div() 
	{
		System.out.println("Unimplemented Method 3rd");	
	}
	public static void main(String[] args) 
	{ 
		Abstract_Class z1 = new Abstract_Class();
		z1.add();
		z1.mul();
		z1.div();	//Call methods as we have learned in method calling for static as well as non-static
		sum();
		z1.end();
	}
}



















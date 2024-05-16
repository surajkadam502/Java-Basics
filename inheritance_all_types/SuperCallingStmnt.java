package inheritance_all_types;

class Four 
{
	Four(double b)
	{
		System.out.println("4");
	}
}
class Two1 extends Four
{
	Two1 (int i)
	{
		super(13.5);   //This is Explicit & argument is to call his parent constructor ie.Four
		System.out.println("1");
	}
}
class One1 extends Two1
{
	One1 () 
	{
		super(20);   //for non para if super keyword written then it is explicit
		             // always used to call his parent constructor here int i = 20
		System.out.println("2");
	}
}
public class SuperCallingStmnt extends One1
{   
	SuperCallingStmnt () 
	{   // super(); here also it is present
		//for non para if super keyword is not written then it is implicit
		//it is always present in lower order class's method
		//execution of those class will be done, who's having relation with other classes
		System.out.println("3");
	}
public static void main(String[] args)
    {
	    new SuperCallingStmnt();
    }
}

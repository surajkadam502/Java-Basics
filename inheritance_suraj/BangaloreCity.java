package inheritance_suraj;
class KarnatakaState  //parent class
{
	void ITHUB()//1
	{
		System.out.println("bangalore city is the IT Hub 1");
	}
	static void ITHUB2() 
	{
		System.out.println("bangalore city is the IT Hub 2");
	}
	void ITHUB3()
	{
		System.out.println("bangalore city is the IT Hub 3");
	}
}
public class BangaloreCity extends KarnatakaState   //BanaloreCity child class -Contains main method
{
	void ITHUB()//2
	{	
		System.out.println("Silion city of India");
		super.ITHUB();  //Parent method name and child method name is same so super keyword is placed inside child class method
		                //but dont use inside main method
		                //used to call parent constructor from child 
	}
public static void main(String[] args) 
{
	BangaloreCity b1=new BangaloreCity();  //Object creation for non-static child method calling
	b1.ITHUB();   //Child class non-static method is called and super keyword is used inside child method so it will also execute
	ITHUB2();
	b1.ITHUB3(); //names are different so, can call directly by object creation of child class
}
}

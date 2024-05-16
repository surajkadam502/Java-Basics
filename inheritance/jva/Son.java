package inheritance.jva;

public class Son extends Parent1
{
	void test () 
	{
		System.out.println("I am Son");
	}
public static void main(String[] args) 
{
	Son s = new Son();
	s.test();
	s.test1();
	s.suraj();
}
}


class Parent1 extends Parent
{
   void test1 ()
   {
	   System.out.println("We are Parent");
   }	
}


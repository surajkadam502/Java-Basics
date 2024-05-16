package inheritance_all_types;

class Parent1
{
	static void add() 
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition ="+c);
	} 
	void sub() 
	{
		int a = 10;
		int b = 20;
		int c = a-b;
		System.out.println("Substitution ="+c);
	}
}
abstract class Mantor extends Parent1
{
	abstract void mul();
	abstract void div();
}
public class Abstract_Class3 extends Mantor
{
   void additional() 
   {
	   System.out.println("Additional Method");
   }
   static void additional2() 
   {
	   System.out.println("Additional second Method");
   }
   public static void main(String[] args) 
   {
	   Abstract_Class3 l1 = new Abstract_Class3 ();
	   l1.additional();
	   additional2();
	   l1.mul();
	   l1.div();
	   l1.sub();
	   add();
   }

   void mul() 
   {
	   System.out.println("Logic of Multiplication");
   }

   void div() 
   {
	   System.out.println("Logic of Division");
   }
}

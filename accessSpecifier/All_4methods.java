package accessSpecifier;

public class All_4methods
{
   public void add() 
   {
	   System.out.println("Addition");
   }
   
   private void sub() 
   {
	   System.out.println("Subtraction");
   }
   
   protected static void mul() 
   {
	   System.out.println("Multiplication");
   }
   
   static void div()     //no access specifier means by default it is using package/default
   {
	   System.out.println("Division");
   }
   
   public static void main(String[] args)  //inside class we can call any methods without considering access specifier
   {
	   div();
	   mul();
	   All_4methods w1 = new All_4methods ();
	   w1.add();
	   w1.sub();
   }
}

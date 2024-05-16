//Hierarchical level

package inheritance_all_types;

public class Hierarchical_Level_Inheritance extends Parent
{
	void subtract()
    {
	System.out.println("Test 1");
    }
    public static void main(String[] args) 
   {
   System.out.println("Execution Started =");
   Hierarchical_Level_Inheritance x1 = new Hierarchical_Level_Inheritance();
   x1.subtract();
   x1.add();
   //Class son methods can't inherited
   }
}
class Parent 
{
	void add()
	{
		System.out.println("Test 2");
	}
}
class Son extends Parent
{
	void multiple()
	{
		System.out.println("Test 3");
	}
}

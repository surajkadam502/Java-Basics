//Single level static Inheritance

package inheritance_suraj;

public class Student_Child_Subclass extends Teacher_Parent_Superclass 
{
   void add() 
   {
	   int a = 50;
	   int b = 60;
	   int c = a+b;
	   System.out.println(c);
   }
   
   public static void main(String[] args) 
   {
	
	System.out.println("Inherited parent class =");
	sub ();   //static method from parent class
	Student_Child_Subclass m = new Student_Child_Subclass ();
	m.add();    //own method of child class
	m.add(2); //non static method from parent class
	
	
   }
}

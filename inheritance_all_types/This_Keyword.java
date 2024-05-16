package inheritance_all_types;



public class This_Keyword 
{
   int age;
   String name;
   
   void Student_Details(int a,String n) 
   {
	   this.age=a;
	   this.name=n;
	   System.out.println("Vlaues of Local Variables are assigned to Global Variables");
   }
   public static void main(String[] args)
   {
	   This_Keyword x1 = new This_Keyword ();
	   x1.Student_Details(30,"Suraj");  //to call the method arguments should be correct !
	                                    // those values will be assigned to global variables
	   System.out.println("Student Details =");
	   System.out.println(x1.age);
	   System.out.println(x1.name);
   }
}

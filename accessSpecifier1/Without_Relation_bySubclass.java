package accessSpecifier1;
import accessSpecifier.All_4methods;  //package name.class name

public class Without_Relation_bySubclass 
{
   public static void main(String[] args)
   {
	   System.out.println("Execution");
	   All_4methods k1 = new All_4methods();
	   
	   k1.add();  //can call only public methods 
   }
}

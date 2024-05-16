package inheritance_all_types;

class Associate 
{
  void Employee () 
  {
	  System.out.println("Associate");
  }	
  static void me () 
  {
	  System.out.println("Trial");
  }
}
class JuniorAssociate  extends Associate  
{
  void JuniorEmployee () 
  {
	  System.out.println("Junior Associate");
  }	
}
public class MultiLevel_INH extends JuniorAssociate 
{
  void Manager() 
  {
	  System.out.println("Manager");
  }
  public static void main(String[] args)
  { 
	me();  
	MultiLevel_INH x1 = new MultiLevel_INH ();
	x1.Employee();
	x1.JuniorEmployee();
	x1.Manager();
	x1.me(); //can call static method in this way
	
	
  }
}


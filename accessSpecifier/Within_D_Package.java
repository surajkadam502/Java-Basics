package accessSpecifier;

public class Within_D_Package 
{
   public static void main(String[] args)
   {
	   Example m1 = new Example();
	   m1.suraj();
	   m1.kamlesh();
	   m1.mahesh();
	   //m1.dhiraj();   can't access private properties within the package
   }
}

class Example 
{
	public void suraj() 
	{
		System.out.println("Suraj");
	}
	
	protected static void mahesh() 
	{
		System.out.println("Mahesh");
	}
	
	private void dhiraj() 
	{
		System.out.println("Dhiraj");
	}
	
	static void kamlesh() 
	{
		System.out.println("Kamlesh");
	}
}

/*Q4 - Multiple level Inheritance using interface
    Four interface class one child class*/


package inheritance_all_types;
interface Maharashtra 
{
	void CapitalM();
}

interface Goa
{
   void CapitalG();	
}

interface Assam
{
   void CapitalA();	
}

interface Delhi
{
   void CapitalD();	
}
public class Interfc4_Multiple implements Maharashtra,Goa,Assam,Delhi
{

	@Override
	public void CapitalD() 
	{
      System.out.println("Capital of Delhi is Chandigarh");
	}

	@Override
	public void CapitalA()
    {
		System.out.println("Capital of Assam is Sikkim");
	}

	@Override
	public void CapitalG() 
	{
		System.out.println("\"Capital of Goa is Panji\"");
	}

	@Override
	public void CapitalM()
	{
		System.out.println("\"Capital of Maharashtra is MUMBAI\"");
	}
	
	public static void main(String[] args)
	{
		Interfc4_Multiple z1 = new Interfc4_Multiple();
		z1.CapitalA();
		z1.CapitalD();
		z1.CapitalG();
		z1.CapitalM();
	}
}

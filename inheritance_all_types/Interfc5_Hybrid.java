/* Q5 - two interface class -->>one abstract class-->>one child class*/

package inheritance_all_types;
interface Maharashtraa1 
{
	void CapitalM();
}

interface Goaa1
{
   void CapitalG();	
}

abstract class India implements Maharashtraa1,Goaa1
{
  abstract void CapitalI();	
}
public class Interfc5_Hybrid extends India
{
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
	@Override
	void CapitalI() 
	{
		System.out.println("\"Capital of India is Delhi\"");
	}
	
	public static void main(String[] args) 
	{
		Interfc5_Hybrid l1 = new Interfc5_Hybrid();
		l1.CapitalI();
		l1.CapitalM();
		l1.CapitalG();
	}
}

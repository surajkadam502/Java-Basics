package inheritance_suraj;

abstract class bike    //abstract class
{
  abstract void run();	 //abstract method 
}

public class AbstarctMethod extends bike {

	@Override
	void run() 
	{
		System.out.println("Overridden Completed");	
	}
	
	public static void main(String[] args) 
	{
		AbstarctMethod x1 = new AbstarctMethod();
		x1.run();
	}

}

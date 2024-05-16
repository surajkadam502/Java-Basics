//upcasting = 0-1-2    upcasting = 0-2
//downcasting = 2-0

package type_casting;

class GrandParent
{
	void GP() 
	{
		System.out.println("2");
	}
}

class Parent extends GrandParent
{
	void AB() 
	{
		System.out.println("1");
	}
}

public class Assignment2 extends Parent
{
	void Suraj() 
	{
		System.out.println("0");
	}

	public static void main(String[] args) 
	{
		GrandParent u1 = new Assignment2(); //0 to 2 invoked so 1 and 0 properties cant used
		u1.GP();
		//u1.AB(); not possible 
		//u1.Suraj(); not possible 
		
		System.out.println("Downcasting = ");
		Assignment2 u2 = (Assignment2)u1;  //downcasting 
		u2.GP();
		u2.AB();
		u2.Suraj();		
	}
}

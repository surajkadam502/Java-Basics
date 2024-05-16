package inheritance_suraj;

public class SIngleLevelnSingleClass extends parent
{
	void gk() 
	{
		System.out.println("Combo");
	}
	
	public static void main(String[] args)
	{
		SIngleLevelnSingleClass x1 = new SIngleLevelnSingleClass();
		x1.gk();
		x1.selenium();
		x1.java();
	}
}

class parent
{
	void selenium() 
	{
		System.out.println("Addition");
	}
	
	void java() 
	{
		System.out.println("Subtarction");
	}
	
}
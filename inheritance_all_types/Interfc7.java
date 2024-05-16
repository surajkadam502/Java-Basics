package inheritance_all_types;

interface Z 
{
	void z();
}

interface X extends Z
{
   void x();	
}

interface Y extends X
{
   void y();	
}
public class Interfc7 implements Y
{
	public static void main(String[] args) 
	{
		 Interfc7 r1 = new Interfc7();
		 r1.x();
		 r1.y();
		 r1.z();
	}
    public void z() 
	{
		System.out.println("z");
	}
	public void y() 
	{
		System.out.println("y");
	}
	public void x() 
	{
		System.out.println("x");
	}
}

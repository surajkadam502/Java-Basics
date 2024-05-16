package type_casting;
class One
{
	void Upcasting1() 
	{
		System.out.println("1");
	}
}

class Two extends One
{
	void Upcasting2() 
	{
		System.out.println("2");
	}
}
public class Assignment3 extends Two
{
    void Upcasting3() 
    {
    	System.out.println("3");
    }
	public static void main(String[] args) 
	{
	   Two v1 = new Assignment3(); /* Assignment3 to Two hence class Two and above all properties will invoke except 
	                                 Subclass ie.Assignment3 (Upcasting Concept) */
	   v1.Upcasting1();
	   v1.Upcasting2();
	   
	   //Downcasting 
	   System.out.println("Downcasting = ");
	   Assignment3 v2 = (Assignment3)v1;
	   v2.Upcasting1(); // in downcasting all child class and above class props will be invoked 3,2,1
	   v2.Upcasting2();
	   v2.Upcasting3();
	}
}

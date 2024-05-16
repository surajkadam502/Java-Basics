/*Q3 - Multiple level Inheritance using interface
    Two interface class one child class*/

package inheritance_all_types;

interface State_tax
{
	void State_ITTax();
	void State_GSTTax();
}

interface Country_Tax
{
    void Country_ITTax();
    void Country_GSTTax();
}

public class Interfc3_Multiple implements Country_Tax,State_tax
{
   void Total_Tax() 
   {
	   System.out.println("Total Tax Collection =");
   }

@Override
public void State_ITTax() 
{
	System.out.println("Total State IT Tax = 52Cr");	
}

@Override
public void State_GSTTax()
{
	System.out.println("Total State GST Tax = 52Cr");
}

@Override
public void Country_ITTax() 
{
	System.out.println("Total Country IT Tax = 520Cr");
}

@Override
public void Country_GSTTax() 
{
	System.out.println("Total Country GST Tax = 520Cr");
}
public static void main(String[] args) 
{
	Interfc3_Multiple k1 = new Interfc3_Multiple();
	k1.State_ITTax();
	k1.State_GSTTax();
	k1.Country_ITTax();
	k1.Country_GSTTax();
	k1.Total_Tax();
}
}

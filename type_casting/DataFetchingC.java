// Simple upcasting -

package type_casting;

class Excelsheet
{
	void DataFetching() 
	{
		System.out.println("Parent Class");
	}
}
public class DataFetchingC extends Excelsheet   //concept of inheritance used here to create rela
{
    void LoginToLogout() 
    {
    	System.out.println("Child Class");
    }
    
    public static void main(String[] args)
    {
		Excelsheet e1 = new DataFetchingC(); //upcasting
		//Superclass    //Child Class object
		
		  e1.DataFetching();  //in upcasting only parent class properties and above that class can be invoke
		//e1.LoginToLogout(); properties of child class(self) can't invoke
		  
		//Downcasting -
		  System.out.println("Downcasting = "); //in downcasting both child and parent class props can invoke
		                                        //while downcasting ,upcasting is done forcefully
		  DataFetchingC e2 = (DataFetchingC)e1 ; //for more understanding refer onwards Assignment2
		  e2.DataFetching();
		  e2.LoginToLogout();
	}
}

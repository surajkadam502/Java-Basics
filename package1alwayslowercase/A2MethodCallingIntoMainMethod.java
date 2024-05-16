
//Methods calling inside the main method
//Java always executes the code line by line inside the main method(Sequential)
//every sub-method or other than main method,should call inside the main method for it's execution
//we can call any sub-method multiple times inside the main method
//we can place any method anywhere inside the class body
//we can call static method by only it's name ex. add()


package package1alwayslowercase;

public class A2MethodCallingIntoMainMethod 
{
  public static void add()  //sub method
  {
	  System.out.println("1+1=2");
	  System.out.println("2+7=9");
  }
  
	public static void main(String[] args)  //main method
	{
		System.out.println("line by line execution as shown below:");
		subtraction();
		System.out.println("1st Answer");
		add();
		subtraction();
		add();
	}
	
  public static void subtraction()  //sub method
  {
	  System.out.println("1-1=0");
	  System.out.println("9-1=8");
  }
}

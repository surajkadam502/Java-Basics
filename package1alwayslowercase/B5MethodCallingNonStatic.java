/* Method calling - Non Static 
   1. Object creation is mandatory to call any Non static method
   2. Syntax - Class name ref.variable(x) = new Class name();
               ref.veriable(x).method name ();
   3. We can call multiple methods by using single ref.variable            

*/
package package1alwayslowercase;

public class B5MethodCallingNonStatic 
{
	  public void Addition() 
      {
	    int a=10;
	    int b=20;
	    int sum=a+b;
	    System.out.println(sum);
      }
     public void Subtraction() 
      { 
    	int a=20;
 	    int b=10;
 	    int sub=a-b;
 	    System.out.println(sub);
      }
    
    public static void main(String[] args) 
      {
    	B5MethodCallingNonStatic x = new B5MethodCallingNonStatic();
    	x.Addition();
    	x.Subtraction();	
	  }
}

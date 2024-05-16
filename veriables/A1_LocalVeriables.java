/* Local Veriables -
   - Declared inside the method only
   - Scope will be inside the method only
   - Brown in color
   - Can't be distinguish between Static and Non static
   - Dont have any default value = declaration and initialization is needed
   - Can't be utilized until and unless it is initialized.   
 */

package veriables;

public class A1_LocalVeriables 
{
  public void add() 
  {
	  int a = 100; //Local - Inside method
	  int k;
	  k = 65;
	  int s = a+k;
	  System.out.println(s);
  }
  
   static void sub (int a , int c)  // Local variables
  {
	  int c1;
	  c1 = 3;
	  int df = a+c;  //value from main method
	  System.out.println(c1);   // Not possible if not initialized  
	  System.out.println(df);
  }
   
   public static void main(String[] args) 
   {
 	int b;
 	b = 50; //Initialized
 	System.out.println(b);
 	sub(12,15);
 	A1_LocalVeriables d = new A1_LocalVeriables();
 	d.add();
   }
}

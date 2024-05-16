/* SIB _ IIB
 For 1 object - Multiple IIB and one constructor will execute
     2 objects - IIB how many created and two constructor which will follow no of IIB's
 Order of execution will never change
     1. SIB
     2. Main Method - 
     3. IIB
     4. Constructor
*/

package package1alwayslowercase;

public class B8BlocksSIB_IIB
{ 
  static
  {
   System.out.println("SIB Block 1");  //No need of object creation - SIB Block
  }
  {
   System.out.println("IIB Block 1");  //Need to create Object to run - IIB Block
  }                                    // Can call multiple IIB with single Object
  B8BlocksSIB_IIB()
  {
	System.out.println("Constructor 1");  
  }
  B8BlocksSIB_IIB(int a)
  {
	System.out.println("Constructor 2");  
  }
  B8BlocksSIB_IIB(char b)
  {
	System.out.println("Constructor 3");  
  }
  B8BlocksSIB_IIB(int a, int b)
  {
	System.out.println("Constructor 4");  
  }
  public static void main(String[] args) 
  {
	new B8BlocksSIB_IIB(10,20);
	System.out.println("Main Method");
	B8BlocksSIB_IIB s1 = new B8BlocksSIB_IIB(); // Object for IIB Block execution
	new B8BlocksSIB_IIB(10); 
	new B8BlocksSIB_IIB('c');
  }                                             
  {
	System.out.println("IIB Block 2");  //Need to create Object to run - IIB Block
  }
  static
  {
   System.out.println("SIB Block 2");  //No need of object creation - SIB Block
  }
  
}

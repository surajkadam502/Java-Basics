/* Type casting - 
        Converting one type into another type is type casting
   Types of Type casting -
   1. Primitive Type Casting-
        Converting one datatype into another datatype is nothing but premitive type casting
        
    1.A. Narrowing -
          Converting bigger datatype into smaller datatype
          
    1.B. Widening -
          Converting smaller datatype into bigger datatype
          
          small <<--------------------Narrowing--------------------- bigger
                        [ byte short int long float double ]
          small --------------------Widening--------------------->> bigger
        
   2. Class Type Casting-
        Converting one class object into another class type
        
    2.A. Upcasting - 
          Converting subclass (Child Class) object into superclass (Parent Class)
          
    2.B. Downcasting - 
          Converting superclass (Parent Class) object into subclass (Child Class)
          
       Important Points -
       1. Inheritance is involved here, as terms superclass subclass are coming in picture. (Extend Keyword)
       2. Upcasting can be done both implicit and explicit ways
       3. Downcasting can be done only explicit manner
       4. Downcasting will never possible without upcasting
       5. Narrowing can be done only explicit manner
       6. Widening can be cone both implicit and explicit
  */

package type_casting;

public class prmtive_type_casting 
{
  public static void main(String[] args) 
  {
	double myweight = 67; //widening implicit
	System.out.println(myweight);
	
	//int wt = 67.12 ; //narrowing not possible (Only explicit)
	
	int wt = (int)67.12 ; //converted
	System.out.println(wt);
	
	double v1 = -55;
	System.out.println(v1);
	
	int v2 = (int)5682.265;
	System.out.println(v2);
	
	//byte to short
	
	/*byte a1 = (byte)200;
	System.out.println(a1);*/
	 byte a1 = 20; 
	 short a2 = a1; 
	 a2 = 405;   
	 System.out.println(a2);
	
  }
}

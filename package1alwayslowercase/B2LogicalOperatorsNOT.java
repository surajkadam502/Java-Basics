/*Logical Operators - 1.AND  2.OR  3.NOT

  Table for OR Logic -        Syntax -                                
  Cond     o/p              
    T       F                 if (!(Cond1  && Cond2 ))
    F       T                       {       
                                    }
  NOT logic will just reverse the output.
  True to False
  False to True                                  
*/


package package1alwayslowercase;

public class B2LogicalOperatorsNOT 
{
	public static void main(String[] args) 
	{
	        int a = 100;
		    int b = 200;
		    if (!(a>=b))       //False condition will reverse to True condition, and it will get executed
		     { 
		    	 System.out.println("Answer will be reverse");
		     }
		    if (!(a>=b && b<=a))       //False condition will reverse to True condition, and it will get executed
		     { 
		    	 System.out.println("Answer will be reverse");
		     }
	}
   
}

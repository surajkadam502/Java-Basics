/*Logical Operators - 1.AND  2.OR  3.NOT

  Table for OR Logic -        Syntax -                                
  Cond1   Cond2   O/p           
    T       T      T            if (Cond1 T && Cond2 T) - Execute        
    T       F      T            if (Cond1 T && Cond2 F) - Execute
    F       T      T            if (Cond1 F && Cond2 T) - Execute
    F       F      F            if (Cond1 F && Cond2 F) - UnExecutable
*/

package package1alwayslowercase;

public class B1LogicalOperatorsOR
{
   public static void main(String[] args) 
   {
			int a = 120;
			int b = 200;
			
			if (a<b || a!=b)   //Both conditions are satisfied then will execute
			{
				System.out.println("Condition 1");
			}
			
			if (a>b || a==b)   // If both conditions will not satisfy then it will not execute
			{
				System.out.println("Condition 2");
			}
			
			if (a<b || a==b)   // If any condition will satisfy then it will execute
				               // a<b this condition is satisfying 
			{
				System.out.println("Condition 3");
			}
			
			if (a<=b || a>=b)   // If any condition will satisfy then it will execute
				                // a<b this condition is satisfying, but a=b is not (Any one then OK)
			{
				System.out.println("Condition 4");
			}
   }
	
}

/*Logical Operators - 1.AND  2.OR  3.NOT

  Table for AND Logic -        Syntax -                                
  Cond1   Cond2   O/p           
    T       T      T            if (Cond1 T && Cond2 T) - Execute        
    T       F      F            if (Cond1 T && Cond2 F) - UnExecutable
    F       T      F            if (Cond1 F && Cond2 T) - UnExecutable
    F       F      F            if (Cond1 F && Cond2 F) - UnExecutable
*/

package package1alwayslowercase;

public class A9LogicalOperatorsAND 
{

	 public static void main(String[] args)
	 {
		int a = 120;
		int b = 200;
		
		if (a<b && a!=b)   //Both conditions should satisfy then only will execute
		{
			System.out.println("Condition 1");
		}
		
		if (a>b && a==b)   // If any condition will not satisfy then it will not execute
		{
			System.out.println("Condition 2");
		}
		
		if (a<b && a==b)   // If any condition will not satisfy then it will not execute
		{
			System.out.println("Condition 3");
		}
		
	}
}

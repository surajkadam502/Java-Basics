/*3.Nested if else -
   Syntax - 
 
   if(Cond1)        //if Cond1 will be True, it will execute cond2 and will print the output
   {                //if Cond1 will be false then it will not execute Cond2, directly 'else1' statement will be the output
    syso            //if C1 = True & C2 = False, then 'else2' will be executed
         if(Cond2)
         {
          syso
         }
         else2
         {
         }
   }
   else1
   {
    syso
   }
   
 */

package package1alwayslowercase;

public class B4Nasted_ifelse 
{
    public static void main(String[] args) 
    {
		int salary = 98000;
		char gender = 'M';
	    String name = "Suraj";
	    
		if(salary > 50000)
		{
			if(gender == 'M')
			{ 
				if(name == "Dhiraj")
				{
					System.out.println("Person is correct");
				}
				else
				{
					System.out.println("Person is Incorrect");
				}
				
			}
			else
			{
				System.out.println("Gender is wrong");
			}
		    
		}
		else
		{
			System.out.println("Condition 1 is False");
		}			
	}
}

/*2. if elseif
 
  syntax- 
  if(C1)        // can use only one 'if'
  {
  }
    else if(C2) // can use many 'else if(C)' in syntax
    {
    }
  else          // always without condition and only one
  {
  }
[ Only True condition will execute in manner of 1st come 1st execute, if 1st condition will be True it will not
 consider for other conditions and simply output will through, even if other conditions are True.
 It is used to add more conditions if previous one is not True ]
*/
package package1alwayslowercase;

public class B3If_elseif 
{
   public static void main(String[] args) 
  {
	 int a = 100;
	 int b = 50;
	 
	 
	 if (a<10)        /*Only first come First will execute, here If = True hence only this will execute 
	                   even if 'else if' condition is True it will not execute */
	 {                
		 System.out.println("If block will execute");
	 }
	 else if (a==100)  //This will execute only when 'if' block will 'False' and this will be 'True'
	 {
		 System.out.println("If else if 1 block will execute");
	 }
	 else if (b==50)  //This will execute only when 'if' block and above all blocks will be 'False' and this will be 'True'
	 {
		 System.out.println("If else if 2 block will execute");
	 }
	 else              //This will execute only when all conditions will be False
	 {
		 System.out.println("else block will execute");
	 }
  }
}

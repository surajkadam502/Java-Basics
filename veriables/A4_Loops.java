/* Loop - Looping
 1] for loop - (for = keyword)
  - Non technical explanation = 
   for (Origin; destination/Condition ; increment i++/i--)
       {
       }
  - Actual Syntax = 
   for (int i=1; i<3 ; i++)         now i=1   i<3 = 1<3 = true = i++ ie +1 increment
       {                            now i=2   i<3 = 2<3 = true = i++ ie +1 increment
       }                            now i=3   i<3 = 3<3 = false = cursor will exit & increment will stop
                                    will get only two outputs
  - if condition will satisfy then only for loop will execute
*/

package veriables;

public class A4_Loops 
{
   public static void main(String[] args) 
   {
	System.out.println("Starting of for loop");
	for (int i =1; i<=5; i++)     //if i=1; i<4 then 3 outputs   if i=1; i<=4 then 4 outputs
	{
		int a = 10;
	    int b = 20;
	    System.out.println("My Name is 'Suraj'");
	    System.out.println(a+b);
	}
	for (int i =5; i>=1; i--)     //if i=5; i>1 then 4 outputs   if i=5; i>=5 then 5 outputs
	{
		int a = 10;
	    int b = 20;
	    System.out.println("End of loop2, Output =");
	    System.out.println(a+b);
	}
	System.out.println("Ending of for loop");
	
	//infinite loop 
	/*for (int i = 0; i<5 ; i--)    // here i=0; 0<5 ; i-- = true so  next i = -1, -2, -3,.....infinite 
	{
		System.out.println(i);
	}
	for (int i = 5; i>3 ; i++)    // here i=5; 5>3 ; i++ = true so  next i = 5,6,7,8,.....infinite 
	{
		System.out.println(i);
	}*/
   }
}

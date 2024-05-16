//Scanner Class -
/* - Predefined class in JAVA, which has lots of methods present into it.
 * - Scanner class is bydefault Final Class (Can't be inheritated)
 * it accepts only human inputs
 * Methods present in scanner class with their return types
   1. next()=String
   2. nextInt()= Int
   3. nextByte() = Byte
   4. nextShort() = Short
   5. nextLong() = Long
   6. nextFloat() = Float
   7. nextBoolean = Boolean
   8. nextDouble = Double
 * Scanner class is always Parameterized ,Argument needed to call constructor (System.in)
 * Syntax - 
            Scanner s1 = new Scanner (System.in);
            int a = s1.nextInt();
 * hover the mouse over Scanner and import package must ! i.e. import java.util.Scanner
*/

package veriables;

import java.util.Scanner;

public class A5_ScannerClass 
{   
	static void add() 
	{
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter x ");
		int x = s1.nextInt();
		System.out.println("Enter y ");
		int y = s1.nextInt();
		int sum = x+y;
		System.out.println("Sum of X + y = "+sum);
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter a ");
		int a = s1.nextInt();
		System.out.println("Enter b ");
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("sum ="+sum);
		add();
	}
 }


/* Arrays - 
   - Used to store Homogeneous values.(Same Datatype)
   - arrays can store null values too (Undefined values / unknown values)
   - arrays can also be sorted (Asc / Desc order)
   - Syntax:
     datatype variable[] = new datatype [Size]
 ex. int roll no [] = new int [4]; only 4 numbers can be stored
     boolean answer [] = new boolean [3]; only 3 value can be stored
     String name [] = new String [7]; only 7 names can be stored 
   - arrays store values in the form of index (0,1,2,3,4,...)
     Ex, S U R A J
         0 1 2 3 4 --> Indexing
         |<----->| --> Length (5)
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A_BasicsArrays {

	public static void main(String[] args)
	{
		int rollno [] = new int [4];
		rollno[0]=10;
		rollno[1]=11;
		rollno[2]=12;
		rollno[3]=13;
		System.out.println("Enter Values");
		for (int i = 0; i<=3 ; i++) 
		{
			Scanner sc = new Scanner(System.in);
			rollno[i] = sc.nextInt();
			//System.out.println(rollno[i]);
		}
		System.out.println(Arrays.toString(rollno));
	}

}

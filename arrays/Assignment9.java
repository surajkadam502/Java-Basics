//find 45 number is present in array or not-->> give message
package arrays;

public class Assignment9 {

	public static void main(String[] args) 
	{
		int numbers[]= {12,45,65,60};  //second syntax of Array
		
		/*int numbers[]=new int [4];
		numbers[0]=12;
		numbers[1]=45;   //both array syntax are same
		numbers[2]=65;
		numbers[3]=60;*/
		
		int size = numbers.length;
		System.out.println(size);  // to check size of array
		
		int rollno = 45;
		
		for (int i = 0; i<=3; i++) 
		{
			if (rollno == numbers[i])
			{
				System.out.println("True = " + numbers[i]);
			}
			else 
			{
				System.out.println("False = "+numbers[i]);
			}
		}
		
		

	}

}

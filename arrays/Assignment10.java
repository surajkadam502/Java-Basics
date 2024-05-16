//Find out the index of no 41 in given array of length 5
package arrays;

public class Assignment10 {

	public static void main(String[] args) 
	{
		int numbers[]= {17,41,82,43,100};
		
		for(int i=0; i<=numbers.length -1 ; i++  ) 
		{
			if (numbers[i] == 41) 
			{
				System.out.println("Index of number 41 is"+" "+i);
			}
		}
		
	}

}

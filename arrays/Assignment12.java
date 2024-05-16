package arrays;

public class Assignment12 
{
	public static void main(String[] args)
	{
		int number[] = {20, 30,50,41};
		int A = 0;
		System.out.println("Enter the number");
		int Fourtyone = 41;
		
		for (int i =0; i<= number.length - 1; i++)
		{
			if (Fourtyone == number[i]) {
				System.out.println("Index of "+Fourtyone+" is "+i);
				A++;
			}
		}
		if (A == 0)
		{
			System.out.println(Fourtyone+":is not present in the index");
		}
	}
}

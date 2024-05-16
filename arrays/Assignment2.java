package arrays;

public class Assignment2 {

	public static void main(String[] args)
	{
		String m1 = "Software";
		String m2 = "Testing";
		
		for (int i = m1.indexOf("S"); i<=m1.length()-1;i++) // i = m1.indexOf("S") = 0
			                                                // i<= i<=m1.length()-1 <=8-1 = 7
		{
			System.out.println(m1.charAt(i));
		}
		for (int i = m2.indexOf("T"); i<=m2.length()-1; i++) 
		{
			System.out.println(m2.charAt(i)); //else concat both strings then print
		}

	}

}

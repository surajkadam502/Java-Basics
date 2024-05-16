package arrays;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		String m1 = "My name is SURAJ"; //Reverse the whole string
		
		for(int i = m1.indexOf("J"); i>= m1.indexOf("M"); i--) 
		{
			System.out.print(m1.charAt(i));
		}
	}
}

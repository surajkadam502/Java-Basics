package arrays;

public class Assignment3 {

	public static void main(String[] args) 
	{
		String m1 = "MOM";
		String m2 = "DAD";
		
		for(int i = 0; i<=2; i++) 
		{
			System.out.println(m1.charAt(i)); /*Logic is i=0 will execute first for both strings as we are using
			                                  common for loop for both so o/p = M,D 
			                                  similarly for i=1 o/p = O,A, for i=2 o/p = M,D*/
			System.out.println(m2.charAt(i));
		}
	}
}

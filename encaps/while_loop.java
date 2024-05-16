package encaps;

public class while_loop 
{
    public static void main(String[] args)
    {
		int age = 48;
		while (age>25) 
		{
			int current_age = age+1;
			System.out.println(current_age);
			age--; //decrement 49,48,47.....27
		}
	}
}

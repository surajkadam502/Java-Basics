package arrays;

public class Assignment66 {

	public static void main(String[] args)
	{
       int values[]= {15,62,54,65};
       
       int sum = 0;
       
       for (int i=0; i<values.length;i++) 
       {
    	   sum = sum + values[i];
       }
       
       System.out.println("Sum ="+sum);
       double Avg = sum/4;
       System.out.println(Avg);
       
       double Mod = sum%4 ;
       System.out.println(Mod);
       
	}

}

package arrays;

public class Assignment67 {

	public static void main(String[] args) 
	{
       String s1 = "Suraj";
       String s2 = "Kadam";
       
       String s1s2 = s1.concat(s2);
       System.out.println(s1.concat(s2));
       
       for (int i=s1s2.indexOf("m"); i>=0; i--) 
       {
    	   System.out.print(s1s2.charAt(i));
       }
       
	}

}

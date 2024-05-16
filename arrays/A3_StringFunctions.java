// printing string in vertical manner -->> a.charAt(i)
package arrays;

public class A3_StringFunctions 
{
   public static void main(String[] args)
   {
	 String name = "Dattatray";
	 
	 for (int i=0; i<=name.length()-1;i++) 
	 {
		 System.out.println(name.charAt(i));
	 }
	 
     System.out.println(name.charAt(6)); //only 'r'will be print
     
     for(int i =name.indexOf("y"); i>=0; i--)  //Print vertically Reverse[name.indexOf("y") = 8]
     {
    	 System.out.println(name.charAt(i));
     }
   }
}

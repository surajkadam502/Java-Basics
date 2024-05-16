package ObjectClass;

public class MathClass 
{
   public static void main(String[] args) 
   {
	 int addition = Math.addExact(2565, 2646); //without initialization and declaration R.T=int
	 
	 System.out.println(addition);
	 
	 int subtraction = Math.subtractExact(500, 36);
	 System.out.println(subtraction);
	 
	 double pi = Math.PI; //R.T = double as value = 3.14....
	 System.out.println(pi);
	 
	 double r = Math.random(); //gives always random value
	 System.out.println(r);
	 
	 //Area of Circle A = pi*r*r
	 
	 double A = pi*r*r ;
	 System.out.println(A);
 
   }
}

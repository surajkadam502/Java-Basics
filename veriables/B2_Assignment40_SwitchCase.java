//Value of switch no should be from scanner class -


package veriables;

import java.util.Scanner;

public class B2_Assignment40_SwitchCase 
{
	static int b;
    static Scanner sc1 = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{  
		System.out.println("Enter value of b");
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    b=sc1.nextInt();

	    switch (b)  //no break keyword is used so leakage will occur till end
	    {
	     case 1: if (a < 5) 
	               {
	    	         System.out.println("A<2");
	               }
	             else 
	               {
	            	 System.out.println("A<2");
	               }
	     case 2: if (a <= 5) 
                   {
	                 System.out.println("A<=2");
                   }
                 else 
                   {
                 	 System.out.println("A<2");
                   }
	                break;   //a = 1 then case 1 and case 2 will execute only because no break
	                         //a = 2 then execution will start from 2 and end before case 3 as break is applied
	     case 3: if (a <= 5) 
                   {
	                 System.out.println("A<=2");
                   }
                 else 
                   {
      	             System.out.println("A<2");
                   }
	    default: System.out.println("I am default for local");  // switch no != case no then only or no break till end
        
	     
	     //if we use global variable :
	     
	     case 4: if (b < 6) 
	               {
	    	         System.out.println("B<2");
	               }
	             else 
	               {
	            	 System.out.println("B<2");
	               }
	     case 5: if (b <= 6) 
                   {
	                 System.out.println("B<=2");
                   }
                 else 
                   {
                 	 System.out.println("B<2");
                   }
	                 //break;   //a = 1 then case 1 and case 2 will execute only because no break
	                          //a = 2 then execution will start from 2 and end before case 3 as break is applied
	     case 6: if (b <= 6) 
                   {
	                 System.out.println("B<=2");
                   }
                 else 
                   {
      	             System.out.println("B<2");
                   }  
	     //default: System.out.println("I am default for global");  //only one default keyword can use
	     
	     //For add(),sub(),mul(),div();
	     
	     case 7 : add();
	     
	     case 8 : sub();
	     
	     case 9 : B2_Assignment40_SwitchCase c1 = new B2_Assignment40_SwitchCase();
	              c1.mul();  
	              
	     case 10 :B2_Assignment40_SwitchCase c2 = new B2_Assignment40_SwitchCase(); 
	    	      c2.div();
	    } 
	}
	static void add() 
	{
		int g = 10;
		int h = 20;
		int i = g+h;
		System.out.println(i);
	}
	static void sub() 
	{
		int g = 50;
		int h = 20;
		int i = g-h;
		System.out.println(i);
	}
    void mul() 
    {
    	int x = 500;
    	int y = 2;
    	int z = x*y;
    	System.out.println(z);
    }
    void div() 
    {
    	int x = 500;
    	int y = 2;
    	int z = x/y;
    	System.out.println(z);
    }	
}

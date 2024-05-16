package inheritance_all_types;

import java.util.Scanner;

public class Single_Level_INH extends child
{
  int s;
  int u;
  int r;
  Scanner sc = new Scanner (System.in);
  
  void add() 
  {  
	 System.out.println("Enter Value of 1st s =");
	 s = sc.nextInt(); 
	 System.out.println("Enter Value of 1st u =");
	 u = sc.nextInt();
	 r = s + u;
	 System.out.println("Addition of 1st ="+""+""+r);
  }
  static void sub() 
  {
	  Scanner sg = new Scanner(System.in);
	  System.out.println("Enter Value of 1st Local p =");
	  int p = sg.nextInt();
	  System.out.println("Enter Value of 1st Local i =");
	  int i = sg.nextInt();
	  int t = p - i;
	  System.out.println("Subtraction of 2nd ="+""+t);
  }
  public static void main(String[] args)
  {
 	System.out.println("Execution Started");
 	Single_Level_INH z1 = new Single_Level_INH();
 	z1.add();
 	sub();
 	z1.mul();
 	z1.div();
  } 
}

class child 
{
 int s;
 int u;
 int r;
 Scanner sc = new Scanner (System.in);	
  
 void mul() 
 { 
	 System.out.println("Enter Value of 2nd s =");
	 s = sc.nextInt();
	 System.out.println("Enter Value of 2nd u =");
	 u = sc.nextInt();
	 r = s*u;
	 System.out.println("Multiplication of 3rd ="+""+""+r); 
 }
 void div() 
 {
	  Scanner sg = new Scanner(System.in);
	  System.out.println("Enter Value of 2nd Local p =");
	  int p = sg.nextInt();
	  System.out.println("Enter Value of 2nd Local i =");
	  int i = sg.nextInt();
	  int t = p / i;
	  System.out.println("Subtraction of 2nd ="+""+t);
 }
  	 
}

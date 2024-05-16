package veriables;
import java.util.Scanner;
public class A8_Assignment38AreaOfTriangle
{
  int b;
  int h;
  double areat;
  Scanner z1 = new Scanner (System.in);
  
  void AreaT () 
  {
	System.out.println("Enter width1");
 	b = z1.nextInt();
 	System.out.println("Enter Height1");
	h = z1.nextInt();
	areat=1/2*b*h;
	System.out.println("Area of Traingle 1"+areat);
  }
  void Area () 
  {
	  Scanner a1 = new Scanner(System.in);
	  System.out.println("Enter width");
	  int b = a1.nextInt();
	  System.out.println("Enter height");
	  int h = a1.nextInt();
	  double area = 0.5*b*h;
	  System.out.println("Area of Traingle" +area);
  }
  public static void main(String[] args) 
  {
	  A8_Assignment38AreaOfTriangle z1 = new A8_Assignment38AreaOfTriangle();
	  z1.Area();
	  z1.AreaT();	  
  }
}

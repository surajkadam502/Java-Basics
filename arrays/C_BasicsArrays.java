package arrays;

import java.util.Arrays;

public class C_BasicsArrays 
{
  public static void main(String[] args) 
  {
	int rollno[] = new int[3];
	String name[] = new String[3];
	boolean answer[]= new boolean[3];
	
	rollno[0]=15;
	name[0]="First";
	answer[0]= true;
	
	rollno[1]=25;
	name[1]="Second";
	answer[1]= false;
	
	rollno[2]=35;
	name[2]="Third";
	answer[2]= true;
	
	/* Or second way of writing code -  
	rollno[0]=63;  
	rollno[1]=83;
	rollno[2]=623;
	
	name[0]= "Rolex";
	name[1]= "Fastrack";
	name[2]= "Titan";
	
	answer[0]= true;
	answer[1]= true;
	answer[2]= true;*/
	
	for(int i=0; i<=2; i++) 
	{
		System.out.println(rollno[i]);
		System.out.println(name[i]);
		System.out.println(answer[i]);
	}
	System.out.println(Arrays.toString(rollno));
	System.out.println(Arrays.toString(name));
	System.out.println(Arrays.toString(answer));
	
  }
}

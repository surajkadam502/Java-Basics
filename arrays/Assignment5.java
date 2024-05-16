package arrays;

import java.util.Date;

public class Assignment5 {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		d1.getTime();
		System.out.println(d1.getTime()); //it will give answer in the form of EPOCH VALUE--Use EpochConverter
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);           //It will give value in Human Understandable format
		
		String MyTime = d2.toString();    //By using String function,only converting d2 value into string format
		System.out.println(MyTime);
		
	}
}

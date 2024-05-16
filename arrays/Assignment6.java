package arrays;

import java.util.Date;

public class Assignment6 
{
	public static void main(String[] args) 
	{
	   Date d1 = new Date();
	   d1.getTime();
	   System.out.println(d1.getTime());//it will give answer in the form of EPOCH VALUE--Use EpochConverter
	   
	   Date d2 = new Date(d1.getTime()); //It will give value in Human Understandable format
	   System.out.println(d2);
	   
	   String MyData = d2.toString(); //only converting d2 value into string format
	   System.out.println(MyData);
	   
	   String Day = MyData.substring(0,3); /*from MyData string we are selecting only substring of Day as Sat
	                            indexing -->> S=0, a=1, t=2 so selecting substring as (0,3) it print (3- 1)th char*/
	   System.out.println(Day);
	   
	   String Month = MyData.substring(4, 7);/*from MyData string we are selecting only substring of Month as Dec
                                indexing -->> D=4, e=5, c=6 so selecting substring as (4,7)it print (7- 1)th char*/
	   System.out.println(Month);
	   
	   System.out.println("Length of String : " +MyData.length());
	   
	   String Date = MyData.substring(0, 11);
	   System.out.println(Date);
	   
	   String Year = MyData.substring(8, 10);
	   System.out.println(Year);
	   
	   String FinalDate = Day.concat("/").concat(Month).concat("/").concat(Year);
	   System.out.println(FinalDate);
	   
	   //For Future Date -(1000*60*60*24*2/3/4...) where 2/3/4 are next days
	   Date d3 = new Date(d1.getTime()+(1000*60*60*24*2));
	   System.out.println(d3);
	   
	  
	}

}

package encaps;

class Student_Data
{
	private int Age=25; //declaration and initialization

	public int getAge()
	{
		return Age;
	}

	public void setAge(int Age) 
	{
		this.Age = Age;
	}
	
}
public class Encaps_2
{
   public static void main(String[] args) 
   {
	   Student_Data b1 = new Student_Data();
	   b1.setAge(45); //first set the value then get method to call it
	   System.out.println(b1.getAge());  
   }
}

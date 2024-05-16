// 4-3-2-1   upcasting = 3-2
// Downcasting = 2-3

package type_casting;

class ass1
{
	void firstmethod() 
	{
		System.out.println("First Method 1");
	}
}

class ass2 extends ass1
{
	void secondmethod() 
	{
		System.out.println("Second Method 2");
	}
}

class ass3 extends ass2
{
	void thirdmethod() 
	{
		System.out.println("Third Method 3");
	}
}
public class Assignment4 extends ass3
{
	void fourmethod() 
    {
    	System.out.println("Fourth Method 4");
    }

	public static void main(String[] args) 
	{
        ass2 a1 = new ass3();  //upcasting is done 3-2 ; so prop of 2,1 will be invoke; 3,4 will not invoke
        a1.firstmethod();
        a1.secondmethod();
        
        System.out.println("Downcasting = ");
        //Downcasting
        ass3 a2 = (ass3)a1; //object of upcasting child class (ass3) with upcasting ref variable a1
        a2.firstmethod(); //child class and above all prop can invoke 3,2,1, not below class props i.e 4th
        a2.secondmethod();
        a2.thirdmethod();
	}

}

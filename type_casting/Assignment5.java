//upcasting = 5-3-2-1    upcasting = 3-2
//Downcasting = 3-5
package type_casting;

class asss1
	{
		void firstmethod() 
		{
			System.out.println("First Method 1");
		}
	}

class asss2 extends asss1
	{
		void secondmethod() 
		{
			System.out.println("Second Method 2");
		}
	}

class asss3 extends asss2
	{
		void thirdmethod() 
		{
			System.out.println("Third Method 3");
		}
	}
public class Assignment5 extends asss3
	{
		void fourmethod() 
	    {
	    	System.out.println("Fourth Method 4");
	    }

		public static void main(String[] args) 
		{
	        asss2 a1 = new asss3();  //upcasting is done 3-2 ; so prop of 2,1 will be invoke; 3,5 will not invoke
	        a1.firstmethod();
	        a1.secondmethod();
	        
	        //Downcasting - need to add upcasting 5-3, bcoz downcasting is not possible without upcasting
	        asss3 a2 = new Assignment5(); //object of parent class(3) has been created with child class(5)
	        Assignment5 a3 = (Assignment5)a2; //create object of child class (Assignment5)of upcasting explicitely
	                                          //use ref variable of upcasting with child class here a2
	        System.out.println("Downcasting =");
	        a3.firstmethod(); //we can access targeted class and above all props in downcasting 5,3,2,1
	        a3.secondmethod(); //but we cant access below class props of targeted class
	        a3.thirdmethod();
	        a3.fourmethod();
		}
	}


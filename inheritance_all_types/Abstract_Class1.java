package inheritance_all_types;

abstract class API                         //abstract class
{
  abstract void login();
  abstract void auth();
  abstract void logout(); 
}

public class Abstract_Class1 extends API   //child class
{
	void login() 
	{
	    System.out.println("Logic of Login");		
	}
	void auth() 
	{
		System.out.println("Logic of Authentication");	
	}
	void logout()
	{
		System.out.println("Logic of Logout");	
	}
	public static void main(String[] args) 
	{
		Abstract_Class1 m1 = new Abstract_Class1();
		m1.login();
		m1.auth();
		m1.logout();	
	}
}

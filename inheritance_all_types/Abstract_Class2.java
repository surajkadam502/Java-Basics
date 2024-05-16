//Abstract class using multi level inheritance

package inheritance_all_types;

abstract class One 
{
	abstract void login ();
	abstract void otp ();
}
abstract class Two extends One
{
	abstract void logout();
}
public class Abstract_Class2 extends Two
{
	void logout() 
	{
		System.out.println("Logic of Logout");	
	}
	void login() 
	{
		System.out.println("Logic of Login");	
	}
	void otp() 
	{
		System.out.println("Logic of OTP");	
	}
	public static void main(String[] args) 
	{
		Abstract_Class2 n1 = new Abstract_Class2();
		n1.login();
		n1.otp();
		n1.logout();
	}
}

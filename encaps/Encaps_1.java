package encaps;

class Authentication_API
{
	private String Username = "suraj@gtm.com"; /*don't have to give direct access to this info so access specifier
	                                             is Private*/
	public String get_Username()  //void return type is changed to String, b'coz can't use return keyword with void
	{
		return Username;
	}
	public void set_Username(String Username) // argument return type should be same as getter and setter method
	{
		this.Username=Username;
	}
	private String Password = "suraj@gtm.com";
	public String get_Password() 
	{
		return Password;
	}
	
	public void set_Password(String Password) 
	{
		this.Password = Password;
	}
}
public class Encaps_1 
{
    public static void main(String[] args) 
    {
    	Authentication_API a1 = new Authentication_API();
    	a1.set_Username("sk@mkt.com"); //now we are setting new values for indirect access
    	a1.set_Password("mkt@123");
    	
    	System.out.println(a1.get_Username()); //now calling newly settled values via get method calling
    	System.out.println(a1.get_Password());			
	}
}

package accessSpecifier;

import accessSpecifier1.extended_parents;

public class With_Relation_Extends extends extended_parents  //with creating relation using extends
{
	public static void main(String[] args)
	{
	    System.out.println("With relation by using extends");	
	    
	    With_Relation_Extends o1 = new With_Relation_Extends();  //can access only public and protected methods not private and default
	    o1.sms();
	    o1.mail();
	    
	}
}

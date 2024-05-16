package arrays;

public class Assignment7 {

	public static void main(String[] args) 
	{
		//ReplaceAll -->> nothing but remove without space"" in some case
		String a = "abhishekh";
		a.replaceAll("a", "");
		System.out.println(a.replaceAll("a", "")); //'a' will remove as "", if space given o/p =_bhishekh
		
		String b = "Suraj";
		b.replaceAll("s", "S");
		System.out.println(b.replaceAll("s", "S")); //'s'='S'
		
		String Quote = "I love my India";
		//Remove all spaces
		Quote.replaceAll(" ", "");
		System.out.println(Quote.replaceAll(" ", ""));
		
		//remove all alphabates from Alpha-numeric values
		String o  = "rolex35648";
		o.replaceAll("[a-z]", "");
		System.out.println(o.replaceAll("[a-z]", ""));
		
		String o1  = "My Name Is Lakhan";
		o.replaceAll("[a-z]", "");
		System.out.println(o1.replaceAll("[a-z]", ""));
		String o2 = "M N I L";
		System.out.println(o2.replaceAll(" ", ""));
		
		//Combination of upper and lower case 
		String o3 = "SuRaJ";
		System.out.println(o3.replaceAll("[a-z]", "")); //o/p = all capital letters
		System.out.println(o3.replaceAll("[A-Z]", "")); //o/p = all lower case letters
				
		
	}

}

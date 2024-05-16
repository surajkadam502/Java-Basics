package arrays;

public class A2_StringFunctions 
{
    public static void main(String[] args) 
    {
	   String s1 = "     I love my country.      ";
	   System.out.println(s1.length());
	   s1.trim(); //removes extra space but only at start and end of the string.
	   System.out.println(s1.trim());
	   System.out.println(s1.length()); //lenght of string
	   
	   String s2 = "   I     love     my     Country.    ";
	   //s2.trim(); space in between two words will not remove
	   System.out.println(s2.trim());
	   System.out.println(s2.length());//lenght of string
	   
	   //concat - joining of two strings
	   
	   String a1 = "Gobi";
	   String a2 = " Manchurian";
	   a1.concat(a2);
	   System.out.println(a1.concat(a2));
	   
	   a1.charAt(3);  //character at index 3 of string "Gobi"
	   System.out.println(a1.charAt(3));
	   
	   a2.indexOf("i");
	   System.out.println(a2.indexOf("i"));
	   
	   //substrings - middle strings
	   String m1 = "Grotechminds";
	   m1.substring(1);
	   System.out.println(m1.substring(1)); //will print from 1st letter of string to end
	   System.out.println(m1.length()); 
	   System.out.println(m1.substring(1, 9)); //from 1st index to 8th letter i.e(n-1)
	   //contains - check whether given char/num is available in string or Not
	   
	   m1.contains("tech");
	   System.out.println(m1.contains("tech")); //true as in contains sequence in Grotechminds
	   System.out.println(m1.contains("g")); //false as this function is case sensitive g not equals to G
	   
	   //matches -->> we have to find exact replica of substring inside current string m1
	   m1.matches("Grotechminds");
	   System.out.println(m1.matches("Grotechminds"));
	   
	   //isEmpty() -->> to ensure string is empty or not. RT = Boolean
	   String g1 = "";
	   String g2 = "Suraj123";
	   g1.isEmpty();
	   System.out.println(g1.isEmpty());
	   System.out.println(g2.isEmpty());
	   
	   //endswith() -->> to find out end char is correct or not
	   String h1 = "Suvarna";
	   h1.endsWith("na");
	   System.out.println(h1.endsWith("na"));
	   System.out.println(h1.endsWith("k"));
	}
}

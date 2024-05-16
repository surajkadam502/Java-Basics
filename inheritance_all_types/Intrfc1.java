// Q1. Interface -
   /* I  - Two abstarct methods
      extends
      I  - Two abstract methods
      Implements
      C  - PSVM*/

package inheritance_all_types;
interface logic1 
{
  void Login();
  void Logout();
}

interface Logic2 extends logic1
{
  void auth();
  void auth2();
}

public class Intrfc1 implements Logic2
{
 static void results() 
 {
	 System.out.println("Results are -");
 }
 public static void main(String[] args) 
 {
	results();
	Intrfc1 m1 = new Intrfc1();
	m1.auth();
	m1.auth2();
	m1.Login();
	m1.Logout();
 }
@Override
public void auth() 
{
	System.out.println("Auth");
}
@Override
public void auth2() 
{
	System.out.println("Auth2");
}
@Override
public void Login() 
{
	System.out.println("Login");
}
@Override
public void Logout() 
{
	System.out.println("Logout");
}
}

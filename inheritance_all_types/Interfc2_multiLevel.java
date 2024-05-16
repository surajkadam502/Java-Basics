//Q2. Multi Level inheritance -->> interface
     
   /* I  - one abstarct methods
      Implements
      Ca - one abstract method - 1 concrete method
      extends
      C  - PSVM*/


package inheritance_all_types;

interface Starting 
{
   void SchoolStarted();	
}
abstract class Middle implements Starting
{
  abstract void SchoolStudy();
  
  void StudyStarted () 
  {
	  System.out.println("Pay attention");
  }
}
public class Interfc2_multiLevel extends Middle
{
  void Ending() 
  {
	  System.out.println("School End");
  }

@Override
public void SchoolStarted()
{
	System.out.println("Lunch Break");
}

@Override
void SchoolStudy() 
{
	System.out.println("Join Class");	
}
public static void main(String[] args) 
{
	Interfc2_multiLevel s1 = new Interfc2_multiLevel();
	s1.SchoolStarted();
	s1.SchoolStudy();
	s1.StudyStarted();
	s1.Ending();
}
}

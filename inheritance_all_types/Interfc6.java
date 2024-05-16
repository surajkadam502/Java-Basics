//Q6. I-->>I-->>Ca-->>C

package inheritance_all_types;

interface A1
{
  void a1();
}

interface B1 extends A1
{
  void b1();	
}

abstract class C1 implements B1
{
  abstract void c1();	
}

public class Interfc6 extends C1
{
  public static void main(String[] args)
  {
	  Interfc6 o1 = new Interfc6();
	  o1.a1();
	  o1.b1();
	  o1.c1();
  }

@Override
public void b1() 
{ 
	System.out.println("B");
}

@Override
public void a1() 
{
	System.out.println("A");
}

@Override
void c1()
{
	System.out.println("C");	
}
}

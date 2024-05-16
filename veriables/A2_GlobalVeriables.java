/*Global Variables -
 - Declared inside the class but outside of the method
 - Blue in color
 - Scope will be from beginning of the class to end of the class 
 - They can be distinguish between static and Nonstatic   i.e. static int a = 20;
 - Global variables have their own default value.
   [int,short,long,byte = 0] ; [double,float = 0.0] ; [boolean = false] ; [String = null] ; [Char = not decided]
 - Can be utilized without initializing as they have their own default value
   if only declaration is done in class ,initializing should be inside any method only 
   
   static veriable to nonstatic method = Direct possible
   Non static variable to static method = Direct not possible, Object creation needed
   
  */

package veriables;
public class A2_GlobalVeriables 
{
	 int c = 3; // Global veriable  I&D
	 static boolean d; // Declaration only so initialization should be under any method
	 static int t;
	 static int g;
	 static int j;
	 int f;
	 int l;
	 int m;
	 
	 public void add() 
	  {
		int a = 100; //Local - Inside method
		d= true; 
		t = 30;
		g = 20;
		j = t-g;
		System.out.println(j);
		f=10;
		l=15;
		m=a+l;   //can add local and global variables
		System.out.println(m);
	  }
	  static void sub (int a , int c)  // Local variables
	  {
		 d = true; 
		 t = 40;
		 g = 50;
		 j = t+g;
		 System.out.println(j);
		 
		 A2_GlobalVeriables x1 = new A2_GlobalVeriables();
		 x1.f = 45;
		 x1.l = 15;
		 x1.m = x1.f + x1.l ;
		 System.out.println(x1.m); 
		 }
		 public static void main(String[] args) 
		  {
			//int b = 50;   //Local
			sub(10,12);
			A2_GlobalVeriables x = new A2_GlobalVeriables();
			x.add();
			
			System.out.println("Global Veriables with their default values -");
			System.out.println(a);
			System.out.println(b);
			System.out.println(z);
			System.out.println(y);
			System.out.println(q);
			System.out.println(r);
			System.out.println(e);
			System.out.println(p);
		  }
		 
		
		/* A2_GlobalVeriables obj = new A2_GlobalVeriables ();
		 obj.f = 20;
		 obj.m = 40;
		 obj.l = f + m;*/	 
	  
	  static int a;
	  static boolean b;
	  static byte z;
	  static short y;
	  static long q;
	  static float r;
	  static double e;
	  static String p;
	  
	
	
}


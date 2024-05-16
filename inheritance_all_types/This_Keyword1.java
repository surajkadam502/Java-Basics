package inheritance_all_types;

public class This_Keyword1 
{
int x = 200;
int y = 300;
public void minus(int x) 
{
	this.x=x;
System.out.println(x + y);
int x1 = 800;
int y = 1000;
System.out.println(x + y);

System.out.println(this.x + this.y);
}
public static void main(String[] args) {
This_Keyword1 p = new This_Keyword1();
p.minus(10);
}
}


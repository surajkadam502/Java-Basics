package inheritance_all_types;

 
class Dog  //Super Class
{  
void bark()
{
	System.out.println("barking...");  
} 

}
class Cat extends Dog   //Middle Class
{  
void meow()
{
	System.out.println("meowing..."); 
} 
}
class Single extends Cat //Sub Class
{  
void eat()
{
	System.out.println("eating...");
} 
public static void main(String args[])
{  
	Single c=new Single();  
    c.meow();  
    c.eat();
    c.bark();
 }
} 



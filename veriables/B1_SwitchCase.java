package veriables;

public class B1_SwitchCase 
{
   public static void main(String[] args) 
   {
       int a = 8;      //a = 2, so second case will execute and so on (switch no = case no)
       switch(a) 
       {
       case 1 : System.out.println("Switch Case = 1");
                break;
       case 2 : System.out.println("Switch Case = 2");
                break;
       case 3 : System.out.println("Switch Case = 3");
                break;         
       case 4 : System.out.println("Switch Case = 4");
                break;
       case 5 : System.out.println("Switch Case = 5");
                break;
       case 6 : System.out.println("Switch Case = 6");
                break; 
       default : System.out.println("if switch no != case number, default line"); //if a = 8, then any case doesn't have this number
       }
       
       switch(a) //if we delete break keyword, leakage will happen till next break
       {     
       case 1 : System.out.println("Switch Case = 1");
                
       case 2 : System.out.println("Switch Case = 2");
                
       case 3 : System.out.println("Switch Case = 3");
                         
       case 4 : System.out.println("Switch Case = 4");
                
       case 5 : System.out.println("Switch Case = 5");
                break;
       case 6 : System.out.println("Switch Case = 6");
                break; 
       default : System.out.println("if switch no != case number, default line"); //if a = 8, then any case doesn't have this number
       }
   }
}

package lab6;

public class lab3_class {

public static int x ;
public String u;
 
 
 public static void displayStatic() //Static method
 {
     x=1;
 System.out.println("x:"+x);
 }
 
 public void display() //non static method
 {
 System.out.println("x:"+x);
 System.out.println("u:"+u);
 }
}

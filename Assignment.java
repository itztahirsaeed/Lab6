package lab6;

import java.util.Scanner;

public class Assignment {
	 public static void main(String args[]){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Input 1st Number: ");
	        int a = in.nextInt();
	        System.out.println("Input 2nd Number: ");
	        int b = in.nextInt();
	        System.out.println("Sum : "+ assign_class.sum(a,b));
	        System.out.println("Prod : "+ assign_class.multiply(a,b));
	        System.out.println("Div: "+ assign_class.divide(a,b));
	        System.out.println("Remainder : "+ assign_class.modulus(a,b));
	        System.out.println("Sin : "+ assign_class.sine(90));
	        System.out.println("Cos : "+ assign_class.cos(180));
	        System.out.println("Tan : "+ assign_class.tan(45));
	    }
}

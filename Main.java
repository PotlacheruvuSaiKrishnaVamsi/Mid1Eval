import java.io.*;
import java.util.*;
public class Main{
 	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Operation op = null;
		System.out.println("1-Addtion,2-Multiplication,3-Subtraction,4-Division");
		int select = scan.nextInt();
		double a,b;
		System.out.println("Enter two numbers");
		a = scan.nextDouble();
		b = scan.nextDouble(); 
		switch(select){
			case 1:op = new Addition();break;
			case 2:op = new Multiplication();break;
			case 3:op = new Subtraction();break;
			case 4:op = new Division();break;
			default:op = new Addition();break; 					
		}
		System.out.println(op.operation(a,b));
	}
}

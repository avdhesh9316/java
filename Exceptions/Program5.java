import java.io.*;
import java.util.Scanner;
class Program5 {
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number : ");
			int x = sc.nextInt();
			System.out.print("Enter second number : ");
			int y = sc.nextInt();
			System.out.println("The Quotient is : " + (x / y));
		} catch(ArithmeticException ae) {
			System.out.println("It throws : " + ae);
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
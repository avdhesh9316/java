import java.io.*;
import java.util.Scanner;
class Program4 {
	public static void main(String args []) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the size of array : ");
			try {
				int N = Integer.parseInt(sc.nextLine());
				int sum = 0;
				int average = 0;
				int [] arr = new int[N];
				System.out.print("Insert items into array : ");
				for(int i = 0; i < N; i++) {
					arr[i] = sc.nextInt();
				}
				try {
					for(int i = 0; i <= N; i++) {
						System.out.println("I am running at " + i + " time");
					}
					throw new ArrayIndexOutOfBoundsException();
				}
				catch(ArrayIndexOutOfBoundsException aie) {
					System.out.println(aie);
				}
				for(int i = 0; i < N; i++) {
					sum += arr[i];
				}
				System.out.println("Sum is : " + sum);
				System.out.println("Average is : " + (sum / N));
			} catch(ArithmeticException ae) {
				System.out.println("Please enter the size of array greater than zero : " + ae);
			}
			
		}
		catch(NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer : " + nfe);
		}
		catch(ArithmeticException ae) {
			System.out.println("Please enter the size of array greater than zero : " + ae);
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}
		finally {
			sc.close();
			System.out.println("Now Program ends");
		}
	}
}
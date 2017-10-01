import java.util.Scanner;
class Program1 {
	public static void main (String args []) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Somthing in digits : ");
			int i = Integer.parseInt(sc.nextLine());
			System.out.println("Square of the Number is : " + (i * i));
		}
		catch(NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer");
		}
	}
}
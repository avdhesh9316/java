import java.util.Scanner;
class ExampleNumberFormatException {
	public static void main (String args []) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number : ");
			String str = sc.nextLine();
			int x = Integer.parseInt(str);
			System.out.println("Unreachable code");
			
			
			sc.close();
		} catch (NumberFormatException nfe){
			System.out.println("You can not enter string. You have to enter only numbers");
			System.out.println("The number format exception is : " + nfe);
		}
		
	}
}
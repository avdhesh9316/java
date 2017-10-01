import java.util.Scanner;
class Program2 {
	public static void main (String args []) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of array : ");
			int N = Integer.parseInt(sc.nextLine());
			System.out.print("Insert items into array : ");
			int [] arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			try {
				System.out.print("Enter the index of particular item to print it : ");
				int ind = sc.nextInt();
				System.out.println("Item with index " + ind + " is : " + arr[ind]);
			} catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("It Throws : " + ae);
			}
		}
		catch(NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer");
		}
	}
}
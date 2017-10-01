import java.io.*;
class DemoBRInput {
	public static void main (String args []) throws IOException{
		//char c;
		String str = "";;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter something or 'stop' for quit : ");
		do {
			str = br.readLine();
			if(str.equals("stop")) {
				System.out.println("Bye Bye");
				break;
			}
			System.out.println("You typed " + str);
			System.out.print("Enter something or 'stop' for quit : ");
		}while(!str.equals("stop"));
	}
}
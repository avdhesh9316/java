class Ex2 {
	public static void main(String[] args) {
		try {
			int i= Integer.parseInt(args[0]);
			System.out.println(i);
		}
		//System.out.println("Wipro");
		catch(NumberFormatException e) {
			System.out.println("Please give input in digits not in string format");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please give one argument at command line");
		}
		System.out.println("Wipro");
	}
}
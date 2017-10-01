class ExampleDivideByZeroException {
	public static void main (String args[]) {
		int x = 0;
		int a;
		try {
			a = 100 / 0;
			System.out.println("I will be never printed");
		} catch(ArithmeticException ae) {
			System.out.println("You can not divide a number with zero");
		}
	}
}
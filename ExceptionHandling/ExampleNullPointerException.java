class ExampleNullPointerException {
	public static void main (String args []) {
		try {
			Integer x = null;
			//System.out.println("The value of X is : " + x);
			System.out.println("Next is Unreachable code");
			System.out.println("The value of Integer Object is " + x);
		} catch(NullPointerException np) {
			System.out.print("You could have intialized the value of x");
		}
	}
}
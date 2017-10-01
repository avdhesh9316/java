class StaticExample1 {
	static int count = 0;
	int counter = 0;
	StaticExample1() {
		count++;
		counter++;
		System.out.println("Count is : " + count + "\nCounter is : " + counter);
	}
	public static void main (String args[]) {
		StaticExample1 se1 = new StaticExample1();
		StaticExample1 se2 = new StaticExample1();
		StaticExample1 se3 = new StaticExample1();
	}
}
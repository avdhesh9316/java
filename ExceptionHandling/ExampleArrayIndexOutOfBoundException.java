class ExampleArrayIndexOutOfBoundException {
	public static void main (String args[]) {
		try {
			int [] arr = new int[5];
			for(int i = 0; i <= arr.length; i++) {
				arr[i] = i;
				System.out.println("This loop will only get executed util the size of array.");
			}
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("You can never go beyond the size of array");
		}
	}
}
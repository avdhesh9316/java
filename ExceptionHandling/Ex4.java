class Ex4 {
	public static void main(String[] args) {
		try {
			int i= Integer.parseInt(args[0]);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		//System.out.println("Exception Caught"); It will cause you to give an compilation error
		finally { }
	}
}
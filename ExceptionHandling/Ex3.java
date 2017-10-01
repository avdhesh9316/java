class Ex3 {
	public static void main(String[] args) {
		try {
			int i= Integer.parseInt(args[0]);
			System.out.println(i);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		/*catch(NumberFormatException e) {
			System.out.println(e);
		}*/
	}
}
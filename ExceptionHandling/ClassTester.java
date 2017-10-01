public class Tester {
	static void method() {
		thrownewException();
	}
	public static void main(String[] args) {
		try{
			method();
		} catch(Throwable e) {
			try{
				thrownewException();
			} catch(Exception ex) {
				System.out.print("exception");
			} finally{
				System.out.print("finally");
			}
		}
	}
}
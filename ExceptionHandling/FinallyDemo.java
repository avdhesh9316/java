import java.io.*;
class FinallyDemo {
	static void funA() throws FileNotFoundException{
		try {
			System.out.println("Inside Function A");
			throw new FileNotFoundException();
		} finally {
			System.out.println("Inside finally block of Function A");
		}
	}
	static void funB() {
		try {
			System.out.println("Inside Function B");
		} finally {
			System.out.println("Inside finally block of Function B");
		}
	}
	static void funC() {
		try {
			System.out.println("Inside Function C");
		} finally {
			System.out.println("Inside finally block of Function C");
		}
	}
	public static void main (String args []) {
		try {
			funA();
		}
		catch (FileNotFoundException e){
			System.out.println("Exception is caught");
		}
		funB();
		funC();
	}
}
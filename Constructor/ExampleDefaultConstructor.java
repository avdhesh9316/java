class ExampleDefaultConstructor {
	int rollno;
	String name;
	void display() {
		System.out.println("Roll no is : " + rollno + " and Name is : " + name);
	}
	public static void main (String args []) {
		ExampleDefaultConstructor edc = new ExampleDefaultConstructor();  // Evolution of default constructor 
		edc.display();
	}
}
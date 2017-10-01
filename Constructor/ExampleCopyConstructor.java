class ExampleCopyConstructor {
	int id;
	String name;
	ExampleCopyConstructor(int i, String n) {
		id = i;
		name = n;
	}
	ExampleCopyConstructor(ExampleCopyConstructor e) {
		id = e.id;
		name = e.name;
	}
	void display() {
		System.out.println("ID : " + id + " NAME : " + name);
	}
	public static void main (String args[]) {
		// Coping values from one object to another using copy constructor
		ExampleCopyConstructor ecc1 = new ExampleCopyConstructor(1001, "Avdhesh");
		ExampleCopyConstructor ecc2 = new ExampleCopyConstructor(ecc1);
		ecc1.display();
		ecc2.display();
		
		// Coping values from one object to another using reference variable
		
		ecc1 = new ExampleCopyConstructor(1002, "Ramesh");
		ecc2.id = ecc1.id;
		ecc2.name = ecc1.name;
		ecc1.display();
		ecc2.display();
	}
}
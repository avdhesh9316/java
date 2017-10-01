class ExampleConstructorOverloading {
	int id;
	String college, name;
	ExampleConstructorOverloading(int i, String n) {
		id = i;
		name = n;
	}
	ExampleConstructorOverloading(String clg) {
		college = clg;
	}
	void display() {
		System.out.println("ID : " + id + " Name : " + name + " and College : " + college);
	}
	public static void main(String args []) {
		ExampleConstructorOverloading eco1 = new ExampleConstructorOverloading(1001, "Ram");
		ExampleConstructorOverloading eco2 = new ExampleConstructorOverloading("PVP");
		eco1.display();
		eco2.display();
	}
}
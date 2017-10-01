class A {
	int m, n;
	void display() {
		System.out.println("properties of A are : " + m + " and " + n);
	}
}
class B extends A {
	int c;
	void display() {
		System.out.println("properties of B are : " + m + ", " + n + " and " + c);
		//System.out.println("properties of B are : " + c);
	}
}
class ExampleInheritance1 {
	public static void main (String args []) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.m = 10;
		obj1.n = 20;
		obj1.display();
		obj2.m = 1;
		obj2.n = 2;
		obj2.c = 3;
		obj2.display();
	}
}
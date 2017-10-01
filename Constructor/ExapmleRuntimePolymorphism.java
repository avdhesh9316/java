class SuperClass {
	void show() {
		System.out.println("I am in SuperClass. I am Parent");
	}
}
class SubClass1 extends SuperClass{
	void show() {
		System.out.println("I am in SubClass1. I am Child 1");
	}
}
class SubClass2 extends SuperClass{
	void show() {
		System.out.println("I am in SubClass2. I am Child 2");
	}
}
class SubClass3 extends SuperClass{
	void show() {
		System.out.println("I am in SubClass2. I am Child 2");
	}
}
class ExapmleRuntimePolymorphism {
	public static void main (String args []) {
		SuperClass sc; // Creating reference variable of SuperClass 
		sc = new SubClass1();
		sc.show();
		sc = new SubClass2();
		sc.show();
		sc = new SubClass3();
		sc.show();
		sc = new SuperClass();
		sc.show();
	}
}
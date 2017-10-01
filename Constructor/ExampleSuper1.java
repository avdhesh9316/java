class A {
	int x;
	A(int x) {
		this.x = x;
	}
	void display() {
		System.out.println("Value of X : " + x);
	}
}
class B extends A {
	int y;
	B(int y) {
		super(y);//call to super must be first statement to the subclass since it intializes super class instance variable prior to subclass.
		// Or you can say that the intialization of super class object must be before sub class object.
		// super keyword solves the problem of Inheritance that all the properties of super class are inherited by sub class except constructor
		this.y = y;
	}
	void display() {
		super.display();
		System.out.println("Value of inherited X : " + super.x + " and Y : " + y);
	}
}
class ExampleSuper1{
	public static void main (String args[]) {
		B obj = new B(100);
		obj.display();
	}
} 
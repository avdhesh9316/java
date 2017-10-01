class X {
	X( ){
		System.out.println("Inside X's Constructor"); 
	} 
	X (int x) {
		System.out.println("The value of X is : " + x);
	}
}
class Y extends X {
	Y( ) {
		//super()  compiler Implicitlly inserts super() statement here
		// The first statement must be either super() or this()	in the default constructor	
		System.out.println("Inside Y's Constructor"); 
	} 
	Y(int y) {
		super(1000);// We have to explicitly use super() here coz there is no default super() statement here in parameterized constructor
		System.out.println("The value of Y is : " + y);
	}
}
class Z extends Y {
	Z(){
		//super()  compiler Implicitlly inserts super() statement here 
		// The first statement must be either super() or this() in the default constructor
		// super() - > calling constructor of the super class 
		// this() - > calling constructor of the same class 
		System.out.println("Inside Z's Constructor"); 
	}
	Z(int z) {
		super(100); // We have to explicitly use super() here coz there is no default super() statement here in parameterized constructor
		System.out.println("The value of Z is : " + z);
	}
}
class OrderOfConstructorCallDemo{
	public static void main(String args[]){
		Z z = new Z(); // Order of invocation of constructor X - > Y - > Z 
		Z z1 = new Z(10);
	}
}
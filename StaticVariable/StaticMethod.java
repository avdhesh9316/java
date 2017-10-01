class StaticMethod {
	int rollno;
	String sname;
	static String college = "PVP";
	StaticMethod(int rl, String sn) {
		rollno = rl;
		sname = sn;
	}
	static void change() {
		college = "ABS";
	}
	void display() {
		System.out.println("Roll no : " + rollno + " Student Name : " + sname + " College : " + college);
	}
	public static void main (String args []) {
		StaticMethod sm1 = new StaticMethod(1001, "Rahul Khanna");
		StaticMethod sm2 = new StaticMethod(1002, "Ramesh Sharma");
		StaticMethod sm3 = new StaticMethod(1003, "Keshav Verma");
		StaticMethod.change();
		sm1.display();
		sm2.display();
		sm3.display();
		StaticMethod.college = "KRK";
		System.out.println("Old College for student sm1 : " + StaticMethod.college);
		System.out.println("Old College for student sm2 : " + StaticMethod.college);
		System.out.println("Old College for student sm3 : " + StaticMethod.college);
	}
}
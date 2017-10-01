class Encapsulation1 {
	private int x;
	private int y;
	public void setX(int x) {
		this.x = (x > 100 ? 50 : (x < 0 ? 0 : x));
	}
	public void setY(int yval) {
		this.y = (y > 50 ? 50 : (y < 0 ? y : 50));
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public static void main (String args[]) {
		Encapsulation1 ec = new Encapsulation1();
		ec.setX(98);
		ec.setY(51);
		System.out.println("Sum of X and Y is : " + (ec.getX() + ec.getY()));
		System.out.println("The value of X : " + ec.x + " and the value of Y : " + ec.y);
	}
}
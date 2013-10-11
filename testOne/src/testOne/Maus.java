package testOne;

public class Maus {
	private int x;
	private int y;
	
	public Maus(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + this.x + " y = " + this.y;
	}

}

package geometria;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public void mover(double enX, double enY) {
		this.x += enX;
		this.y += enY;
	}

}

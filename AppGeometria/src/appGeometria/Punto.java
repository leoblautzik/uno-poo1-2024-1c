package appGeometria;

public class Punto implements Desplazable {

	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void desplazar(Double enX, Double enY) {
		this.x += enX;
		this.y += enY;
	}

	public double distancia(Punto b) {
		return Math.hypot(b.x-this.x, b.y-this.y);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}

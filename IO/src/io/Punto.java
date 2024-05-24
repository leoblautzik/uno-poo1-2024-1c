package io;

public class Punto {

	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Punto b) {
		return Math.hypot(b.x-this.x, b.y-this.y);
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}

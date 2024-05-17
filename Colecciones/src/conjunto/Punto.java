package conjunto;

import java.util.Objects;

public class Punto implements Comparable<Punto> {

	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Punto b) {
		return Math.hypot(b.x - this.x, b.y - this.y);
	}

	public double distanciaAlOrigen() {
		return distancia(new Punto(0, 0));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int compareTo(Punto otro) {
		if (this.distanciaAlOrigen() == otro.distanciaAlOrigen()) {
			if (this.x == otro.x) {
				return Double.compare(this.y, otro.y);
			} else {
				return Double.compare(this.x, otro.x);
			}
		} else
			return Double.compare(this.distanciaAlOrigen(), otro.distanciaAlOrigen());
	}

}

package figuras;

public abstract class Figura implements Comparable<Figura> {

	private double area;

	public Figura(double area) {
		if (area <= 0)
			throw new Error("Area inválida");
		this.area = area;
	}
	
	public final double getArea() {
		return this.area;
	}
	
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
}

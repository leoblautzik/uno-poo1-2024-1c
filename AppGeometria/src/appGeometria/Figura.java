package appGeometria;

public abstract class Figura implements Comparable<Figura>, Desplazable {
	
	private Punto p;

	public Figura(double x, double y) {
		this.p = new Punto(x, y);
	}
	
	@Override
	public void desplazar(Double enX, Double enY) {
		this.p.desplazar(enX, enY);
	}
	
	public abstract double getArea();
	
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
	
}

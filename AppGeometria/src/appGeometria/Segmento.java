package appGeometria;

public class Segmento implements Desplazable, Comparable<Segmento>, EsParalelo {

	private Punto a;
	private Punto b;

	public Segmento(double xa, double ya, double xb, double yb) {
		this.a = new Punto(xa, ya);
		this.b = new Punto(xb, yb);
	}

	public double getLargo() {
		return a.distancia(b);
	}

	@Override
	public Boolean esParaleloAx() {
		return a.getY() == b.getY();
	}

	@Override
	public Boolean esParaleloAy() {
		return a.getX() == b.getX();
	}

	@Override
	public Boolean esParaleloA(EsParalelo s) {
		if (s instanceof Segmento) {
			Segmento sg = (Segmento) s;
			return this.getPendiente().equals(sg.getPendiente());
		}
		throw new Error("El parametro no es un Segmento");

	}

	public Double getPendiente() {
		return (b.getY() - a.getY()) / (b.getX() - a.getX());
	}

	@Override
	public void desplazar(Double enX, Double enY) {
		a.desplazar(enX, enY);
		b.desplazar(enX, enY);
	}

	@Override
	public int compareTo(Segmento o) {
		return Double.compare(this.getLargo(), o.getLargo());
	}

}

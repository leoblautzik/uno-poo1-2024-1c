package appGeometria;

public class Cuadrado extends Figura {

	private Double lado;

	public Cuadrado(double x, double y, Double lado) {
		super(x, y);
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

}

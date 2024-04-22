package appGeometria;

public class Circulo extends Figura {
	
	private Double radio;

	public Circulo(double x, double y, Double radio) {
		super(x, y);
		this.radio = radio;
	}

	

	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}

}

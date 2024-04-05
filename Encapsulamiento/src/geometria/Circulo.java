package geometria;

public class Circulo {
	
	private double radio;
	private Punto centro;
	
	public Circulo(double radio, double xCentro, double yCentro) {
		this.radio=radio;
		this.centro = new Punto(xCentro, yCentro);
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public double obtenerArea() {
		return Math.PI * this.radio * this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}
	
	public void mover(double enX, double enY) {
		centro.mover(enX, enY);
	}
	
	public static void main(String[] args) {
		Circulo c1 = new Circulo(4, 2,2);
		System.out.println(c1);
		c1.mover(-4,-4);
		System.out.println(c1);
	}
	

}

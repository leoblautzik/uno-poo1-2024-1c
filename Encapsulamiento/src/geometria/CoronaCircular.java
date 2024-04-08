package geometria;

public class CoronaCircular {
	
	private Circulo cChico;
	private Circulo cGrande;
	//private Punto centro;

	public CoronaCircular(double rChico, double rGrande, double xc, double yc) {
		if(rChico > rGrande)
			throw new Error("Radio chico debe ser menor que radio grande");
		this.cChico=new Circulo(rChico, xc, yc);
		this.cGrande=new Circulo(rGrande, xc, yc);
	}
	
	public double getRadioChico() {
		return this.cChico.obtenerRadio();
	}
	
	public double getRadioGrande() {
		return this.cGrande.obtenerRadio();
	}
	
	public double getPerimetro() {
		return this.cGrande.obtenerPerimetro() + this.cChico.obtenerPerimetro();
	}
	
	public double getArea() {
		return this.cGrande.obtenerArea() - this.cChico.obtenerArea();
	}
	
	public void mover(double enX, double enY) {
		this.cChico.getCentro().mover(enX, enY);
	}
	
	

}

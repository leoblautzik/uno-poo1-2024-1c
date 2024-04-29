package profesionales;

public abstract class Profesional implements Comparable<Profesional> {

	private static double BASICO = 500000.00;

	private String nombre;
	private String apellido;
	
	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double getBasico() {
		return Profesional.BASICO;
	}
	
	public abstract double getHonorarioMensual();
	
	@Override
	public String toString() {
		return this.apellido + ", " + this.nombre +" : " + this.getHonorarioMensual();
	}
	
	@Override
	public int compareTo(Profesional p) {
		return (-1) * Double.compare(this.getHonorarioMensual(), p.getHonorarioMensual());
	}
	
	

}

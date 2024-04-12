package conHerencia;

public class Empleado {

	private String nombre = " ";
	private double sueldoBasico = 0;
	private Fecha fechaDeNacimiento;

	protected double getSueldoBasico() {
		return sueldoBasico;
	}

	public Empleado(String nombre, double sueldoBasico, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.fechaDeNacimiento = new Fecha(fechaDeNacimiento);
	}

	public double getSalario() {
		return sueldoBasico;
	}

}

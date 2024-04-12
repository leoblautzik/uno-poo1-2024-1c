package sinHerencia;

public class Gerente {
	private String nombre = " ";
	private double sueldoBasico = 0;
	private Fecha fechaDeNacimiento;
	private String departamento;
	
	public Gerente(String nombre, double sueldoBasico, String fechaDeNacimiento, String departamento) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.fechaDeNacimiento = new Fecha(fechaDeNacimiento);
		this.departamento = departamento;
	}
	

	public double getSalario() {
		return sueldoBasico * 1.15;
	}



	
}

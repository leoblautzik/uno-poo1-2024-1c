package conHerencia;

public class Gerente extends Empleado {
	
	private String departamento;

	public Gerente(String nombre, double sueldoBasico, String fechaDeNacimiento, String departamento) {
		super(nombre, sueldoBasico, fechaDeNacimiento);
		this.departamento = departamento;
	}
	
	@Override
	public double getSalario() {
		return super.getSueldoBasico() * 1.15;
	}
	
	

}

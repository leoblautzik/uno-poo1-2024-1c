package conHerencia;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(fechaDeNacimiento, nombre, sueldoBasico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(fechaDeNacimiento, other.fechaDeNacimiento) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldoBasico) == Double.doubleToLongBits(other.sueldoBasico);
	}

}

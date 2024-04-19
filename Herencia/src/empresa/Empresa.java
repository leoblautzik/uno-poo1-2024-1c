package empresa;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Empleado> empleados;

	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}

	public double getMontoTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.getSalario();
		}
		return total;
	}

	public static void main(String[] args) {

		Empresa acme = new Empresa();

		Empleado cacho = new Transitoria(80, 0, true);
		Empleado luis = new Permanente(80, 2, true, 6);
		Gerente ana = new Gerente(160, 1, true, 10);
		Empleado pepe = new Permanente(100, 6, true, 15);

		acme.agregarEmpleado(ana);
		System.out.println("ana " + ana.getSalario());
		acme.agregarEmpleado(luis);
		System.out.println("luis " + luis.getSalario());
		acme.agregarEmpleado(cacho);
		System.out.println("cacho " + cacho.getSalario());
		acme.agregarEmpleado(pepe);
		System.out.println("pepe " + pepe.getSalario());

		System.out.println(acme.getMontoTotal());

	}
}

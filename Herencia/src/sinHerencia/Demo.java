package sinHerencia;

public class Demo {

	public static void main(String[] args) {
		
		Empleado juancito = new Empleado("Juancito", 100.00, "01/02/1995");
		Empleado anita = new Empleado("Ana", 200.00, "01/02/1998");
		
		System.out.println(juancito.getSalario());
		System.out.println(anita.getSalario());
		
		Gerente ramon = new Gerente("Ramon Ortega", 400, "04/10/1956", "Ventas");
		System.out.println(ramon.getSalario());
	}

}

package empresa;

public class Gerente extends Permanente {

	private static double VALOR_HORA = 4000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1500;
	
	public Gerente(int ht, int hijos, boolean casado, int antiguedad) {
		super(ht, hijos, casado, antiguedad);
	}
	
	
	/**
	 * Un gerente cobra de manera similar a un empleado de 
	 * planta permanente pero su hora trabajada vale $4000, 
	 * por antigüedad se le pagan $1500 por año, mientras que 
	 * el salario familiar es el mismo que el de los empleados de 
	 * planta permanente y temporal.
	 */
	@Override
	public double getSalario() {
		return super.getHt() * Gerente.VALOR_HORA 
				+ super.getAntiguedad() * Gerente.VALOR_ANIO_ANTIGUEDAD 
				+ super.getSalarioFamiliar();
	}
}

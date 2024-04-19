package empresa;

public class Permanente extends Empleado {
	
	private int antiguedad;
	private static double VALOR_HORA = 3000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1000;
	
	public Permanente(int ht, int hijos, boolean casado, int antiguedad) {
		super(ht, hijos, casado);
		this.antiguedad = antiguedad;
	}
	/**
	* Cuando un empleado es de planta permanente cobra la cantidad de horas 
	* trabajadas por 	$3000, más antigüedad ($1000 por año de antigüedad), 
	* más salario familiar.
	*/
	@Override
	public double getSalario() {
		return super.getHt() * Permanente.VALOR_HORA 
				+ this.antiguedad * Permanente.VALOR_ANIO_ANTIGUEDAD 
				+ super.getSalarioFamiliar();
	}
	public double getAntiguedad() {
		return this.antiguedad;
	}
	
	
	
	
}

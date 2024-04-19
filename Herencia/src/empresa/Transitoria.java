package empresa;

public class Transitoria extends Empleado {
	
	private static double VALOR_HORA = 2000;

	public Transitoria(int ht, int hijos, boolean casado) {
		super(ht, hijos, casado);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Cuando es de planta temporaria, no cobra antigüedad y 
	 * cobra la cantidad de horas trabajadas por $2000, 
	 * más salario familiar.
	 */
	@Override
	public double getSalario() {
		return super.getHt() * Transitoria.VALOR_HORA
				+ super.getSalarioFamiliar();
	}

}

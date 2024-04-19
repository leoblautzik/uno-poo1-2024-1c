package empresa;

public abstract class Empleado {

	private int ht;
	private int hijos;
	private boolean casado;
	private static double ASIGNACION_POR_HIJO = 2000.00;
	private static double ASIGNACION_CASADO = 1000;	

	public Empleado(int ht, int hijos, boolean casado) {
		this.ht = ht;
		this.hijos = hijos;
		this.casado = casado;
	}

	public double getSalarioFamiliar() {
		double sf = Empleado.ASIGNACION_POR_HIJO * this.hijos;
		if (casado)
			sf += Empleado.ASIGNACION_CASADO;
		return sf;
	}
	
	public abstract double getSalario();

	protected int getHt() {
		return ht;
	}

}

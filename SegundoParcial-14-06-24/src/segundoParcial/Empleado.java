package segundoParcial;

public class Empleado {
	private int sector;
	private int legajo;
	private String apenom;
	private int antiguedad;

	public Empleado(int sector, int legajo, String apenom, int antiguedad) {
		this.sector = sector;
		this.legajo = legajo;
		this.apenom = apenom;
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return this.antiguedad;

}

}

package club;

public abstract class Deportista implements Comparable<Deportista>{
	private int socio;
	protected static double cuotaBase = 10000.00;
	protected int diasPorSemanaDeEntrenaiento;
	
	public Deportista(int nroSocio, int dias) {
		if(dias < 1 || dias > 7) throw new Error("Dias inválidos");
		this.socio = nroSocio;
		this.diasPorSemanaDeEntrenaiento = dias;
	}
	
	public abstract double getCuotaMensual();
	
	@Override
	public int compareTo(Deportista otro) {
		return Integer.compare(this.socio, otro.socio);
	}
	
	@Override
	public String toString() {
		return this.socio + " " + this.getCuotaMensual();
	}
	
	public static void setCuotaBase(double cb) {
		Deportista.cuotaBase = cb;		
	}
	
}

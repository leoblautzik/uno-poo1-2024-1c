package club;

public class Futbolista extends Deportista {
	
	public Futbolista(int socio, int dias) {
		super(socio, dias);
	}
	
	@Override
	public double getCuotaMensual() {
		return Deportista.cuotaBase +  Deportista.cuotaBase * 0.1 * super.diasPorSemanaDeEntrenaiento;
	}

}

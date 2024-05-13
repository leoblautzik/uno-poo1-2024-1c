package club;

public class Tenista extends Deportista{
	
	public Tenista(int socio, int dias) {
		super(socio, dias);
	}
	
	@Override
	public double getCuotaMensual() {
		return Deportista.cuotaBase + 
				Deportista.cuotaBase * super.diasPorSemanaDeEntrenaiento * 0.05;
	}

}

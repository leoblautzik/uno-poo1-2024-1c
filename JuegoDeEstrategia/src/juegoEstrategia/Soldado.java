package juegoEstrategia;

public class Soldado extends Unidad {
	private int energia = 100;

	public Soldado(int posicion) {
		super(10, 200, posicion);
	}

	protected int getEnergia() {
		return energia;
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return this != oponente && !this.estaMuerto() && !oponente.estaMuerto() && this.energia >= 10
				&& this.getPosicion() == oponente.getPosicion();
	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.energia -= 10;
			oponente.setSalud(oponente.getSalud() - this.getDanio());
		}
	}

}

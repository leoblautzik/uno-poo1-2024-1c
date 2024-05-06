package juegoEstrategia;

/**
 * Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen
 * suficiente energía. Cada ataque les consume 10 puntos de energía, y comienzan
 * con 100. Restauran energía si reciben la poción de agua. Infringen un daño de
 * 10 puntos y comienzan con 200 de salud.
 */
public class Soldado extends Unidad implements BebedorDeAgua {

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
				&& estaDentroDelAlcance(oponente, 0, 0);
	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.energia -= 10;
			infingirDanio(oponente);
		}
	}

	@Override
	public void beberAgua() {
		this.energia = 100;
	}

}

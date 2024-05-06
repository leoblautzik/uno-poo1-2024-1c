package juegoEstrategia;

/**
 * Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su
 * enemigo, y si tienen suficientes flechas. Comienzan con 20 flechas en su
 * carcaj, y pueden recargar si reciben un paquete de seis flechas. Infringen un
 * daño de 5 puntos, y comienzan con 50 de salud.
 */
public class Arquero extends Unidad {

	private int flechas = 20;

	public Arquero(int posicion) {
		super(5, 50, posicion);
	}

	public void recargarFlechas() {
		this.flechas += 6;
	}

	protected int getFlechas() {
		return flechas;
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return this != oponente && !this.estaMuerto() && !oponente.estaMuerto() && this.flechas >= 1
				&& estaDentroDelAlcance(oponente, 2, 5);
	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.flechas -= 1;
			infingirDanio(oponente);
		}

	}

}

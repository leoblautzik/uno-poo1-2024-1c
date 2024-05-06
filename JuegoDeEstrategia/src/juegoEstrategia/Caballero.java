package juegoEstrategia;

/**
 * Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo
 * no se haya puesto rebelde. Infringe un daño de 50 puntos y comienza con 200
 * de salud. Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si
 * recibe una poción de agua.
 */

public class Caballero extends Unidad {

	private Caballo caballo;

	public Caballero(int posicion) {
		super(50, 200, posicion);
		this.caballo = new Caballo();
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return this != oponente && !this.estaMuerto() && 
				!oponente.estaMuerto() && 
				!this.caballo.estaRebelde()
				&& estaDentroDelAlcance(oponente, 1, 2);

	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.caballo.sumarAtaque();
			infingirDanio(oponente);
		}
	}

	public Caballo getCaballo() {
		return caballo;
	}

}

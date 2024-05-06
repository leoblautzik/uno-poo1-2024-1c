package juegoEstrategia;

/**
 * Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. 
 * Infringen un daño de 25 puntos, y comienzan con 150 de salud.
 */

public class Lancero extends Unidad{

	public Lancero(int posicion) {
		super(25, 150, posicion);
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return this != oponente && 
				!this.estaMuerto() && 
				!oponente.estaMuerto() &&
				estaDentroDelAlcance(oponente, 1, 3);
				
	}

	@Override
	public void atacar(Unidad oponente) {
		if(this.puedeAtacar(oponente)) {
			infingirDanio(oponente);
		}
		
	}

}

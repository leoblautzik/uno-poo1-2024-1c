package juegoEstrategia;

public class Arquero extends Unidad {
	
	private int flechas = 20;

	public Arquero(int posicion) {
		super(5, 50, posicion);
	}
	
	

	protected int getFlechas() {
		return flechas;
	}



	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return this != oponente && 
				!this.estaMuerto() && 
				!oponente.estaMuerto() && 
				this.flechas >= 1 && 
				Math.abs(this.getPosicion() - oponente.getPosicion()) >=2 && 
				Math.abs(this.getPosicion() - oponente.getPosicion()) <=5;
	}

	@Override
	public void atacar(Unidad oponente) {
		if(this.puedeAtacar(oponente)) {
			this.flechas -=1;
			oponente.setSalud(oponente.getSalud()-this.getDanio());
		}
		
	}

}

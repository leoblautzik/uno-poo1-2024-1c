package juegoEstrategia;

public abstract class Unidad {

	private int danio;
	private int salud;
	private int posicion;

	public Unidad(int danio, int salud, int posicion) {
		this.danio = danio;
		this.salud = salud;
		this.posicion = posicion;
	}

	protected boolean estaMuerto() {
		return this.getSalud() <= 0;
	}

	protected int getPosicion() {
		return posicion;
	}

	protected void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public abstract boolean puedeAtacar(Unidad oponente);

	public abstract void atacar(Unidad oponente);

	protected void infingirDanio(Unidad oponente) {
		oponente.setSalud(oponente.getSalud() - this.getDanio());
	}

	public boolean estaDentroDelAlcance(Unidad oponente, int desde, int hasta) {
		return Math.abs(this.getPosicion() - oponente.getPosicion()) >= desde
				&& Math.abs(this.getPosicion() - oponente.getPosicion()) <= hasta;
	}

	protected int getDanio() {
		return danio;
	}

	protected void setDanio(int danio) {
		this.danio = danio;
	}

	protected int getSalud() {
		return salud;
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}

}

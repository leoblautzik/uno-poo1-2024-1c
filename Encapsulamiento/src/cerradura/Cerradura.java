package cerradura;

/**
 * Implementar la clase Cerradura con los siguientes métodos. Indique axiomas de
 * la clase, pre y post condiciones de los métodos. Cuando una Cerradura se
 * bloquea no puede volver a abrirse nunca más.
 */
public class Cerradura {
	private boolean bloqueada = false;
	private boolean abierta = true;
	private int clave;
	private int intentosQueLaBloquean;
	private int fallosConsecutivos = 0;

	/**
	 * pre: claveDeApertura de 3 digitos) pos: crea la cerradura abierta
	 * 
	 * @param claveDeApertura
	 * @param cantidadDeFallosConsecutivosQueLaBloquean
	 */
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = claveDeApertura;
		this.intentosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(int clave) {
		if(this.bloqueada)
			throw new Error("Cerradura Bloqueada");
		
		if (clave == this.clave) {
			this.fallosConsecutivos = 0;
			abierta = true;
		} else {
			this.fallosConsecutivos++;
			if (this.fallosConsecutivos >= this.intentosQueLaBloquean) {
				this.bloqueada = true;
			}

		}
		return true;
	}
//
	public void cerrar() {
		if (!this.bloqueada && this.abierta) {
			this.abierta = false;
		}
	}
//
//	public boolean estaAbierta()
//
//	public boolean estaCerrada()
//
//	public boolean fueBloqueada()
//
//	public int contarAperturasExitosas()
//
//	public int contarAperturasFallidas()

}

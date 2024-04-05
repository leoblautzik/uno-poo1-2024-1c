package tarjetaBaja;

public class TarjetaBaja {
	
	private double saldo;
	private int viajesEnColectivo = 0;
	private int viajesEnSubte = 0;
	private static double PRECIO_COLECTIVO = 21.50;
	private static double PRECIO_SUBTE = 19.50;
	
	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		this.saldo += monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 21.50 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if (saldo < PRECIO_COLECTIVO) {
			throw new Error("No te alcanza, recargar!!");
		}
		this.saldo -= PRECIO_COLECTIVO;
		this.viajesEnColectivo++;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if (saldo < PRECIO_SUBTE) {
			throw new Error("No te alcanza");
		}
		this.saldo -= PRECIO_SUBTE;
		this.viajesEnSubte++;
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.viajesEnColectivo + this.viajesEnSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return this.viajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return this.viajesEnSubte;
	}

}

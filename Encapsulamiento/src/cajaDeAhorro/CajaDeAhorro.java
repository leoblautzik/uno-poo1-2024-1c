package cajaDeAhorro;

public class CajaDeAhorro {
	
	private double saldo = 0;
	private String titular;

	/**
		 * post: la instancia queda asignada al titular indicado y con 
		 * saldo igual a 0.
		 */
		public CajaDeAhorro(String titularDeLaCuenta) {
			this.titular = titularDeLaCuenta;
		}

	/**
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	public String obtenerTitular() {
		return this.titular;
		
	}

	/**
	 * post: devuelve el saldo de la Caja de Ahorro.
	 */
	public double consultarSaldo() {
		return this.saldo;
	}

	/**
	 * pre : monto es un valor mayor a 0. post: aumenta el saldo de 
	 * la Caja de Ahorro según el monto depositado.
	 */
	public void depositar(double monto) {
		if (monto <= 0)
			throw new Error("Monto inválido");
		this.saldo += monto;		
	}

	/**
	 * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja 
	 * de Ahorro.
	 * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
	 */
	public void extraer(double monto) {
		if(monto > this.saldo)
			throw new Error("Saldo insuficiente");
		this.saldo -= monto;
	}

}

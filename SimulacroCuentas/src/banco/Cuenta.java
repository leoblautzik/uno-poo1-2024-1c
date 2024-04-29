package banco;

public abstract class Cuenta {
	
	private Double saldo = 0.0;
	private int dni;
	
	public Cuenta(int dniDelTitular) {
		this.dni = dniDelTitular;
	}
	
	public void depositar(Double monto) {
		if (!esMontoValido(monto))
			throw new Error("Monto inválido");
		this.saldo+=monto;
	}
	
	public abstract Double extraer(Double monto);
	
	
	protected boolean esMontoValido(Double monto) {
		return monto > 0;
	}
	
	@Override
	public String toString(){
		return this.dni + " Saldo: " + this.saldo;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public int getDNI() {
		return this.dni;
	}
	
	protected void setSaldo(Double monto) {
		this.saldo = monto;
	}
	
	public static void transferir(Cuenta origen, Cuenta destino, Double monto) {
		destino.depositar(origen.extraer(monto));
	}
	
	public void transferir(Cuenta destino, Double monto) {
		//origen va a ser this
		destino.depositar(this.extraer(monto));
	}
	
}

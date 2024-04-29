package banco;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;

	public CuentaCorriente(int dniDelTitular, Double descubierto) {
		super(dniDelTitular);
		if (!esMontoValido(descubierto))
			throw new Error("Monto inválido");
		this.descubierto = descubierto;
	}

	@Override
	public Double extraer(Double monto) {
		
		if(!esMontoValido(monto))
			throw new Error("Monto inválido");
		
		if (!(this.getSaldo() + this.descubierto >= monto))
			throw new Error("No hay saldo suficiente");
		
		this.setSaldo(this.getSaldo() - monto);
		return monto;
	}

}

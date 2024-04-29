package banco;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int dniDelTitular) {
		super(dniDelTitular);

	}

	@Override
	public Double extraer(Double monto) {
		if(!esMontoValido(monto))
			throw new Error("Monto inválido");
		
		if (!(this.getSaldo() >= monto))
			throw new Error("No hay saldo suficiente");
		
		setSaldo(getSaldo() - monto);
		return monto;
	}
}

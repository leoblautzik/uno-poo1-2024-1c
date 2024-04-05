package nota;

public class Nota {

	private int valorNota;

	public Nota(int valor) {
		setValorNota(valor);;
	}

	private void setValorNota(int valor) {
		if (valor < 1 || valor > 10)
			throw new Error("Valor incorrecto");
		this.valorNota = valor;
	}
	
	public void recupera(int nuevoValor) {
		if (nuevoValor > valorNota)
			setValorNota(nuevoValor);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

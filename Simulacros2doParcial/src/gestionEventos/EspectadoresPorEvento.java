package gestionEventos;

public class EspectadoresPorEvento {

	private int[] puertas = new int[15];
	private int cantidadTotalDeEspectadores = 0;

	public void ingresarEspectadoresPorLaPuerta(int puerta, int espectadores) {
		this.puertas[puerta - 1] += espectadores;
		this.cantidadTotalDeEspectadores += espectadores;
	}

	public int getEspectadoresQueIngresaronPorLaPuerta(int puerta) {
		return this.puertas[puerta - 1];
	}

	public int getCantidadTotalDeEspectadores() {
		return this.cantidadTotalDeEspectadores;
	}

}

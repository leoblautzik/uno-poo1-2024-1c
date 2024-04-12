package viaje;

public class Viaje {

	private Escala[] escalas;
	private int proxPosLibre = 0;

	public Viaje(int cantidadMaximaDeEscalas) {

		if (cantidadMaximaDeEscalas <= 0) {
			throw new Error("Cantidad incorrecta");
		}

		this.escalas = new Escala[cantidadMaximaDeEscalas];
	}

	public int getCantidadDeEscalas() {
		return this.proxPosLibre;
	}

	public void registrarEscala(String ciudad, int duracion) {
		if (proxPosLibre >= escalas.length) {
			throw new Error("Viaje completo");
		}
		this.escalas[proxPosLibre] = new Escala(ciudad, duracion);
		proxPosLibre++;
	}

	public int duracionTotal() {
		int suma = 0;
		for (int i = 0; i < proxPosLibre; i++)
			suma += escalas[i].getDuracion();
		return suma;
	}

	public int duracionPromedioTotal() {
		return this.duracionTotal() / this.getCantidadDeEscalas();
	}

	public int contarEscalasConDuracionEntre(int desde, int hasta) {
		int e = 0;
		for (int i = 0; i < proxPosLibre; i++) {
			if (escalas[i].getDuracion() >= desde && escalas[i].getDuracion() <= hasta)
				e++;
		}
		return e;
	}

	public void ciudadMasDuracion() {
		int max = this.escalas[0].getDuracion();
		int posMax = 0;

		for (int i = 1; i < proxPosLibre; i++) {
			if (escalas[i].getDuracion() > max) {
				max = escalas[i].getDuracion();
				posMax = i;
			}
		}
		
		System.out.println("La escala de mayor duracion es: " + escalas[posMax].getCiudad());

	}

}

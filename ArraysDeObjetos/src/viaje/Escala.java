package viaje;

public class Escala {

	private int duracion;
	private String ciudad;

	public Escala(String ciudad, int duracion) {
		this.duracion = duracion;
		this.ciudad = ciudad;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getCiudad() {
		return ciudad;
	}

}

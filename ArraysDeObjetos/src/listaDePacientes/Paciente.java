package listaDePacientes;

public class Paciente {
	private String nombre;
	private int duracionVisita;
	
	public Paciente(String nombre, int duracionVisita) {
		this.nombre = nombre;
		this.duracionVisita = duracionVisita;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracionVisita() {
		return duracionVisita;
	}
	
	

}

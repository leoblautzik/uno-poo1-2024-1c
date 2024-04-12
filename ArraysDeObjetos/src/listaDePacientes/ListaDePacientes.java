package listaDePacientes;

public class ListaDePacientes {

	private Paciente[] pacientes;
	private int proxPosLibre = 0;
	private int tiempoTotalDeEspera = 0;

	public ListaDePacientes(int maxCantPacientes) {
		this.pacientes = new Paciente[maxCantPacientes];
	}

	public void agregarPaciente(String nombre, int duracion) {
		if (proxPosLibre >= pacientes.length) {
			throw new Error("No quedan mas turnos");
		}
		pacientes[proxPosLibre] = new Paciente(nombre, duracion);
		proxPosLibre++;
		tiempoTotalDeEspera += duracion;
	}
	/**
	 * Pre: Los pacientes se nuemeran desde el 1.
	 * @param pos
	 * @return nombre del paciente en pos.
	 */
	public String getNombre(int pos) {
		if (pos <= 0 || pos > proxPosLibre)
			throw new Error("Posicion inválida");

		return this.pacientes[pos-1].getNombre();
	}

	// Cuenta la cantidad de pacientes del día.
	public int getCantidadDePacientes() {
		return proxPosLibre;
	}

	// Calcule la duración total de la espera (en minutos) para un nuevo paciente
	// que se agregue.
	public int getTiempoDeEspera() {
		return tiempoTotalDeEspera;
	}

	// Calcule la duración promedio de las visitas (en minutos).
	public int getDuracionPromedio() {
		return tiempoTotalDeEspera / proxPosLibre;
	}

}

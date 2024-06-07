package gestionEventos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class GestionEventos {
	private Map<String, EspectadoresPorEvento> estadio;

	public GestionEventos() {

		this.estadio = new TreeMap<String, EspectadoresPorEvento>();
	}

	// carga los datos en estadio.
	public void cargarDatosdeLosEventos(String archivoDeEntrada) throws IOException {
		FileReader fr = new FileReader(new File(archivoDeEntrada));
		BufferedReader br = new BufferedReader(fr);

		String linea;
		String[] datos;
		EspectadoresPorEvento puertas;

		linea = br.readLine();
		while (linea != null) {
			datos = linea.split(",");
			// datos[0] -> codigo del evento
			// datos[1] -> nro de puerta
			// datos[2] -> cant de espectadores que ingresaron por esa puerta en ese evento
			String codEvento = datos[0];
			int nroPuerta = Integer.parseInt(datos[1]);
			int cantEspectadores = Integer.parseInt(datos[2]);

			if (estadio.containsKey(datos[0])) {
				puertas = estadio.get(datos[0]);
			} else {
				puertas = new EspectadoresPorEvento();
			}

			puertas.ingresarEspectadoresPorLaPuerta(nroPuerta, cantEspectadores);
			estadio.put(codEvento, puertas);
			linea = br.readLine();
		}
		br.close();

	}

	public void generarEspectadoresPorEvento(String archivoDeSalida) throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter(archivoDeSalida));
		pr.printf("Evento\t Puertas\t 1\t 2\n");
		String linea = "";
		for (Map.Entry<String, EspectadoresPorEvento> cadaEvento : estadio.entrySet()) {
			String evento = cadaEvento.getKey();
			EspectadoresPorEvento puertas = cadaEvento.getValue();
			linea = linea + evento + "\t(CTE: " + puertas.getCantidadTotalDeEspectadores() + ")\t";
			for (int i = 1; i <= 15; i++) {
				linea += puertas.getEspectadoresQueIngresaronPorLaPuerta(i) + "\t";
			}
			linea += "\n";

			pr.print(linea);

		}
		pr.close();

	}

	public static void main(String[] args) throws IOException {
		GestionEventos ge = new GestionEventos();

		ge.cargarDatosdeLosEventos("./src/gestionEventos/espectadores.in");

		ge.generarEspectadoresPorEvento("./src/gestionEventos/salida.out");
	}

}

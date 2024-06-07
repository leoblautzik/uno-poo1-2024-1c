package infractores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Infractores {

	private Map<String, Integer> infractores = new HashMap<String, Integer>();

	public Infractores() {
	}

	public void leerInfractores(String entrada) throws IOException {
		FileReader fr = new FileReader(new File(entrada));
		BufferedReader br = new BufferedReader(fr);
		String[] datos;
		String patente;
		Double velocidad;
		String linea = br.readLine();
		while (linea != null) {
			datos = linea.split(" ");
			patente = datos[0];
			velocidad = Double.parseDouble(datos[1]);
			try {
				if (velocidad > 80) {
					if (infractores.containsKey(patente)) {
						infractores.put(patente, infractores.get(patente) + 1);
					} else {
						infractores.put(patente, 1);
					}
				} else
					throw new LecturaIncorrectaException("Error de Lectura");
			} catch (LecturaIncorrectaException lie) {
				lie.printStackTrace();
			}

			linea = br.readLine();
		}

		br.close();
	}

	public void escribirMultados(String archivoDeSalida) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		salida.println("Importes a abonar por los infractores");

		for (Entry<String, Integer> cu : infractores.entrySet()) {
			String patente = cu.getKey();
			Integer cantMultas = cu.getValue();
			salida.println(patente + "    " + "$" + cantMultas * 50000.00);
		}
		salida.close();
	}

	public Map<Double, List<String>> mapitaPorPlata() {
		Map<Double, List<String>> mapita = new TreeMap<Double, List<String>>(Collections.reverseOrder());
		for (Entry<String, Integer> cu : infractores.entrySet()) {
			String patente = cu.getKey();
			Integer cantMultas = cu.getValue();
			Double importe = cantMultas * 50000.00;
			List<String> lista;
			if (mapita.containsKey(importe)) {
				lista = mapita.get(importe);
			} else {
				lista = new ArrayList<String>();
			}
			lista.add(patente);
			mapita.put(importe, lista);
		}
		return mapita;
	}

	public static void main(String[] args) throws IOException {
		Infractores inf = new Infractores();
		inf.leerInfractores("./src/infractores/infractores.in");
		System.out.println(inf.infractores);

		inf.escribirMultados("./src/infractores/multados.out");
		
		System.out.println(inf.mapitaPorPlata());

	}

}
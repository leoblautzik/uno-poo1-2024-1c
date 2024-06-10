package ratings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/*
 * 11, Gran Hermano, 34.5
 * 13, Los 8 escalones, 24.5
 * 11, Telefe Noticias, 10.4
 * 13, MDQ 2022, 8.7 
 * 2, LAM, 4.5
 */

public class Rating {

	private Map<Integer, List<Programa>> canales = new TreeMap<Integer, List<Programa>>();

	public void leerRatings(String archivo) throws IOException {
		FileReader fr = new FileReader(new File(archivo));
		BufferedReader br = new BufferedReader(fr);
		String linea;
		String[] datos;
		Integer canal;
		String nombre;
		Double rating;
		List<Programa> lista;

		linea = br.readLine();
		while (linea != null) {
			datos = linea.split(",");
			canal = Integer.parseInt(datos[0]);
			nombre = datos[1];
			rating = Double.parseDouble(datos[2]);
			Programa p = new Programa(canal, nombre, rating);
			if (this.canales.containsKey(canal)) {
				lista = this.canales.get(canal);
			} else {
				lista = new LinkedList<Programa>();
			}
			lista.add(p);
			canales.put(canal, lista);
			linea = br.readLine();
		}

		br.close();
		fr.close();
	}

	public void escribirRatingPorCanal(String archivoDeSalida) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		for (Entry<Integer, List<Programa>> cu : this.canales.entrySet()) {
			Integer canal = cu.getKey();
			List<Programa> listaDeProgramas = cu.getValue();
			Double suma = 0.0;
			for (Programa p : listaDeProgramas) {
				suma += p.getRating();
			}
			salida.println(canal + " " + suma / listaDeProgramas.size());
		}
		salida.close();
	}

	public static void main(String[] args) throws IOException {
		
		Rating ra = new Rating();
		
		ra.leerRatings("ratings.in");
		ra.escribirRatingPorCanal("ratings.out");

	}
}

//Ayudas:

//	FileReader fr = new FileReader(new File(archivoDeEntrada));
//	BufferedReader br = new BufferedReader(fr);
//	PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
//  for(Entry<K, V> cu:mapa.entrySet()){
//	keyType key = entry.getKey();
//	valType val = entry.getValue();...}

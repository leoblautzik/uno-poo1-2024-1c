package ventas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Ventas {
	private Map<String, Integer> ventasPorProducto = new HashMap<String, Integer>();

	public Ventas() {

	}

	public void leerVentas(String entrada) throws IOException {

		FileReader fr = new FileReader(new File(entrada));
		BufferedReader br = new BufferedReader(fr);
		String key;
		Integer value;
		String[] datos;

		String linea = br.readLine();
		while (linea != null) {

			datos = linea.split(" ");
			try {
				key = datos[0];
				if (datos[0].length() != 6) {
					throw new CodigoInvalidoException("Codigo incorrecto");
				}
				value = Integer.parseInt(datos[1]);
				if (this.ventasPorProducto.containsKey(key)) {
					value += this.ventasPorProducto.get(key);
				}
				this.ventasPorProducto.put(key, value);
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			} catch (CodigoInvalidoException cie) {
				System.err.println(cie.getMessage());
			}

			linea = br.readLine();
		}

		br.close();
		fr.close();
	}

	public void escribirVentasPorProducto(String archivoDeSalida) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		salida.println("Ventas por producto");

		for (Map.Entry<String, Integer> entry : this.ventasPorProducto.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			salida.println(key + " " + val);

		}

		salida.close();
	}

	public static void main(String[] args) throws IOException {

		Ventas ventas = new Ventas();

		ventas.leerVentas("ventas.in");
		ventas.escribirVentasPorProducto("ventasPorProducto.out");

	}

}

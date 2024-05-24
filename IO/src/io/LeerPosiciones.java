package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerPosiciones {
	public static void main(String[] arg) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("posiciones.in");
			br = new BufferedReader(fr);
			String linea;
			ArrayList<Punto> sobreLosEjes = new ArrayList<Punto>();
			ArrayList<Punto> c1 = new ArrayList<Punto>();
			ArrayList<Punto> c2 = new ArrayList<Punto>();
			ArrayList<Punto> c3 = new ArrayList<Punto>();
			ArrayList<Punto> c4 = new ArrayList<Punto>();

			while ((linea = br.readLine()) != null) {
				try {
					String[] coordenadas = linea.split(",");
					double x = Double.parseDouble(coordenadas[0]);
					double y = Double.parseDouble(coordenadas[1]);
					Punto p = new Punto(x, y);
					if (x > 0 && y > 0) {
						c1.add(p);
					}

					if (x > 0 && y < 0) {
						c4.add(p);
					}

					if (x < 0 && y < 0) {
						c3.add(p);
					}

					if (x < 0 && y > 0) {
						c2.add(p);
					}

					if (x == 0 || y == 0)
						sobreLosEjes.add(p);

				} catch (NumberFormatException e) {
					System.err.println("Uno de los datos leídos no es un double");
				}
			}
			System.out.println(c1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}

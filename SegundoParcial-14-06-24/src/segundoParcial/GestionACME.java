package segundoParcial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GestionACME {

	Map<Integer, List<Empleado>> leerArchivoDePersonal(String entrada) {
		Map<Integer, List<Empleado>> acme = new TreeMap<Integer, List<Empleado>>();
		try {
			FileReader fr = new FileReader(entrada);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String[] datos;
			List<Empleado> l;

			while ((linea = br.readLine()) != null) {
				datos = linea.split(",");
				int sector = Integer.parseInt(datos[0]);
				int legajo = Integer.parseInt(datos[1]);
				String apenom = datos[2];
				int antiguedad = Integer.parseInt(datos[3]);
				Empleado e = new Empleado(sector, legajo, apenom, antiguedad);

				if (acme.containsKey(sector)) {
					l = acme.get(sector);
				} else {
					l = new LinkedList<Empleado>();
				}
				l.add(e);
				acme.put(sector, l);
			}

			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return acme;
	}
	
	int antiguedadPromedioDelSector(int sector, Map<Integer, List<Empleado>> empleados) {
		int acum = 0;
		List<Empleado> empleadosDelSector = empleados.get(sector);
		for (Empleado empleado : empleadosDelSector) {
			acum+= empleado.getAntiguedad();
		}
		
		return  acum / empleadosDelSector.size(); 
	}
	
	//no pedido en el parcial
	public static void main(String[] args) {
		GestionACME ga = new GestionACME();
		
		int antiProDelSector300 = ga.antiguedadPromedioDelSector(300, ga.leerArchivoDePersonal("empleados.csv"));
		System.out.println(antiProDelSector300);
	}

}

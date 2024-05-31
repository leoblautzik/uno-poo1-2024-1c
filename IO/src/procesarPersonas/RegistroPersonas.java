package procesarPersonas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RegistroPersonas {

	public LinkedList<Persona> getPersonas(String archivo) throws IOException {
		LinkedList<Persona> personas = new LinkedList<Persona>();

		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		while (linea != null) {
			String[] datos = linea.split(" ");
			personas.add(new Persona(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2])));
			linea = br.readLine();
		}
		br.close();
		return personas;
	}

	/**
	 * 
	 * 
	 * @param lp   Lista de personas
	 * @param edad
	 * @return
	 * @throws IOException
	 * 
	 * 
	 *                     Implementar un método getPersonasMayoresAEdad que reciba
	 *                     un objeto List<Persona> y una edad y devuelva otro objeto
	 *                     LinkedList<Persona> con las personas cuyas edades son
	 *                     mayores a esa edad. Guardar esas personas en un archivo
	 *                     “personasMayoresDeXX.out”, donde xx sea la edad que se
	 *                     usó como parámetro. Guardarlo ordenado alfabéticamente.
	 */
	public LinkedList<Persona> getPersonasMayoresQue(List<Persona> lp, int edad) throws IOException {
		LinkedList<Persona> personasMayores = new LinkedList<Persona>();

		for (Persona persona : lp) {
			if (persona.getEdad() > edad) {
				personasMayores.add(persona);
			}
		}

		Collections.sort(personasMayores);

		// printList(personasMayores, nombre);

		return personasMayores;
	}

	public void printList(List<Persona> l, String nombre) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(nombre));

		for (Persona persona : l) {
			salida.println(persona);
		}

		salida.close();
	}

	@SuppressWarnings("finally")
	public double getEdadPromedio(List<Persona> l) {
		double sumaEdades = 0;
		double promedio = 0;

		for (Persona persona : l) {
			sumaEdades += persona.getEdad();
		}
		try {
			if (l.size() == 0) {
				throw new ArithmeticException();
			}
			promedio = sumaEdades / l.size();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			return promedio;
		}
	}

	public int cantPersonasConEdadSobreLaMedia(List<Persona> l) {
		int contador = 0;
		double edadPromedio = this.getEdadPromedio(l);
		for (Persona p : l) {
			if (p.getEdad() > edadPromedio)
				contador++;
		}

		return contador;

	}

	public LinkedList<Persona> personasDeMayorEdad(List<Persona> l) {
		LinkedList<Persona> aux = new LinkedList<Persona>();
		int mayorEdad = l.get(0).getEdad();

		for (Persona cp : l) {
			if (cp.getEdad() > mayorEdad) {
				mayorEdad = cp.getEdad();
			}
		}

		for (Persona cp : l) {
			if (cp.getEdad() == mayorEdad) {
				aux.add(cp);
			}
		}

		return aux;
	}

	public LinkedList<Persona> personasDeMenorEdad(List<Persona> l) {
		LinkedList<Persona> aux = new LinkedList<Persona>();
		int mayorEdad = l.get(0).getEdad();

		for (Persona cp : l) {
			if (cp.getEdad() < mayorEdad) {
				mayorEdad = cp.getEdad();
			}
		}

		for (Persona cp : l) {
			if (cp.getEdad() == mayorEdad) {
				aux.add(cp);
			}
		}

		return aux;
	}

	public void personasPorEdad(List<Persona> l) throws IOException {
		TreeMap<Integer, List<Persona>> map = new TreeMap<Integer, List<Persona>>();
		List<Persona> lista;
		
		for (Persona persona : l) {
			Integer key = persona.getEdad();
			if (map.containsKey(key)) {
				lista = map.get(key);

			} else {
				lista = new LinkedList<Persona>();
			}
			
			lista.add(persona);
			map.put(key,lista);
		}
		
		PrintWriter salida = new PrintWriter(new FileWriter("PersonasPorEdad.out"));
			
		salida.println("Listado de Personas agrupadas por edad");
		
		for (Map.Entry<Integer, List<Persona>> p : map.entrySet()) {
			Integer edad = p.getKey();
			List<Persona> lp = p.getValue();
			salida.println("Edad: " + edad);
			for (Persona persona : lp) {
				salida.println(persona);
			}
		}
		
		salida.close();
	}

}

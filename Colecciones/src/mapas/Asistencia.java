package mapas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Asistencia {

	Map<String, List<String>> porDia = new HashMap<String, List<String>>();
	Map<String, List<String>> porAlumno = new TreeMap<String, List<String>>();

	public void procesar() {
		for (Map.Entry<String, List<String>> cadaDia : porDia.entrySet()) {
			String dia = cadaDia.getKey();//dia es la key
			List<String> listaAlumnos = cadaDia.getValue(); //listaAlumnos es el value
			
			List<String> lista;
			for (String cadaAlumno : listaAlumnos) {
				if (porAlumno.containsKey(cadaAlumno)) {
					lista = porAlumno.get(cadaAlumno);
				} else {
					lista = new LinkedList<String>();
				}
				lista.add(dia);
				porAlumno.put(cadaAlumno, lista);
			}
		}
	}
	
	public static void main(String[] args) {
		Asistencia as = new Asistencia();
		List<String> listaMie10 = new LinkedList<String>();
		listaMie10.add("Ana");
		listaMie10.add("Pedro");
		as.porDia.put("Mie 10", listaMie10);

		List<String> listaVie12 = new LinkedList<String>();
		listaVie12.add("Ana");
		listaVie12.add("Luz");
		as.porDia.put("Vie 12", listaVie12);

		List<String> listaMie17 = new LinkedList<String>();
		listaMie17.add("Luz");
		listaMie17.add("Pedro");
		as.porDia.put("Mie 17", listaMie17);
		
		List<String> listaMie1 = new LinkedList<String>();
		listaMie1.add("Luz");
		listaMie1.add("Pedro");
		listaMie1.add("Juancito");
		listaMie1.add("Ruth");
		as.porDia.put("Mie 1", listaMie1);
		
		
		System.out.println(as.porDia);
		
		as.procesar();
		
		System.out.println(as.porAlumno);
		

	}
}

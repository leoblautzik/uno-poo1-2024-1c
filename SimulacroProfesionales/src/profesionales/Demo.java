package profesionales;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		
		Medico m = new Medico("Carlos", "Fernandez");
		Cirujano ciruja = new Cirujano("Fernando" , "Juares");
		CirujanoCardiovascular cirujaCardio = new CirujanoCardiovascular("Juan" , "Moreira");
		Endodoncista endo = new Endodoncista("Laura", "Lopez");
		
		ArrayList<Profesional> profesionales = new ArrayList<Profesional>();
		
		profesionales.add(endo);
		profesionales.add(cirujaCardio);
		profesionales.add(ciruja);
		profesionales.add(m);
		
		for(Profesional cadaPro : profesionales) {
			System.out.println(cadaPro);
		}
		
		Collections.sort(profesionales);
		System.out.println("Ordenados ----------------------------------");
		for(Profesional cadaPro : profesionales) {
			System.out.println(cadaPro);
		}

	}

}

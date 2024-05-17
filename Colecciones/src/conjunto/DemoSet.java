package conjunto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {

		Set<Punto> puntos = new TreeSet<Punto>();
		puntos.add(new Punto(-1, 1));
		puntos.add(new Punto(1, -1));
		puntos.add(new Punto(-1, -1));
		puntos.add(new Punto(1, 1));
		puntos.add(new Punto(1, 1));
		System.out.println(puntos);
		
		Set<String> nombres = new HashSet<String>();
		nombres.add("Luis");
		nombres.add("Laura");
		nombres.add("Raul");
		nombres.add("Raul");
		
		System.out.println(nombres);
		
		System.out.println(nombres.contains("Ana"));
		System.out.println(nombres.contains("Luis"));
	}

}

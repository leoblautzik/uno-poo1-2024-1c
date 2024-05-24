package procesarPersonas;

import java.io.IOException;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		RegistroPersonas rp = new RegistroPersonas();
		
		List<Persona> ps =rp.getPersonas("/home/leoblau/tmp/personas.in");
		System.out.println("Por Encima De la media " + rp.cpemep(ps));
		
		List<Persona> mayores = rp.getPersonasMayoresQue(ps, 30);
		String nombre= "personasMayoresDe" + 30 +".out";
		rp.printList(mayores, nombre);
		for (Persona persona : ps) {
			System.out.println(persona);
			
		}
		System.out.printf("Edad promedio:  %5.2f\n", rp.getEdadPromedio(ps));
		
	}

}

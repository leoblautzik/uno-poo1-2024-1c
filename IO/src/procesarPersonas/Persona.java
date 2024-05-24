package procesarPersonas;

public class Persona implements Comparable<Persona>{
	
	private Integer dni;
	private String apenom;
	private Integer edad;
	
	public Persona(Integer dni, String apenom, Integer edad) {
		super();
		this.dni = dni;
		this.apenom = apenom;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public String getApenom() {
		return apenom;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return dni + ", " + apenom + ", " + edad;
	}

	@Override
	public int compareTo(Persona p) {
		return this.getApenom().compareTo(p.getApenom());
	}
	
	
	
	
	

}

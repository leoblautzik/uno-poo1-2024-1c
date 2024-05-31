package procesarPersonas;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.dni.equals(other.dni);
	}
	
	
	
	
	
	

}

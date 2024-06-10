package ratings;

public class Programa {
	private Integer canal;
	private String nombre;
	private Double rating;
	
	public Programa(Integer canal, String nombre, Double rating) {
		this.canal = canal;
		this.nombre = nombre;
		this.rating = rating;
	}

	public Double getRating() {
		return this.rating;
	}
	
		
	
}

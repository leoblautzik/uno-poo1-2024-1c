package biblioteca;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantidadDePaginas;

	public Libro(String titulo, String autor, Genero genero, int cantidadDePaginas) {
		setTitulo(titulo); 
		setAutor(autor);
		setGenero(genero);
		setCantidadDePaginas(cantidadDePaginas);
	}

	private void setGenero(Genero genero) {
		this.genero = genero;
	}

	String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		if (autor == "")
			throw new Error("Autor no puede quedar vacío");
		this.autor = autor;
	}

	int getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	private void setCantidadDePaginas(int cantidadDePaginas) {
		if (cantidadDePaginas <= 0)
			throw new Error("No se admiten libros sin pǵinas");
		this.cantidadDePaginas = cantidadDePaginas;
	}

	Genero getGenero() {
		return genero;
	}

	private void setTitulo(String titulo) {
		if (titulo == "")
			throw new Error("Título no puede quedar vacío");
		this.titulo = titulo;
	}

	String getTitulo() {
		return titulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, cantidadDePaginas, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && cantidadDePaginas == other.cantidadDePaginas
				&& genero == other.genero && Objects.equals(titulo, other.titulo);
	}
	
	

}

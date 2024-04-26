package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	private int maxCantLibros;

	/**
	 * 1. Se construya a partir de la máxima cantidad de libros que puede contener.
	 * 
	 * @param maxCantidadDeLibros
	 */
	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new ArrayList<Libro>(maxCantidadDeLibros);
		this.maxCantLibros = maxCantidadDeLibros;
	}

	/**
	 * 2. Se pueda consultar la cantidad de libros que contiene.
	 */
	public int cuantosLibros() {
		return this.libros.size();
	}

	/**
	 * 3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de
	 * páginas, siempre y cuando haya lugar en la Biblioteca. Los Generos literarios
	 * que le gustan a éste bibiotecario son: POESIA, CIENCIA-FICCION, AVENTURA,
	 * NOVELA, HISTORIA, INFANTILES.
	 * 
	 * @param titulo, autor, genero, paginas
	 */
	public void agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (this.cuantosLibros() >= this.maxCantLibros)
			throw new Error("No queda mas espacio");

		this.libros.add(new Libro(titulo, autor, genero, paginas));
		
	}

	// 4. Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > this.maxCantLibros)
			throw new Error("Posición fuera de rango");
		return this.libros.get(posicion-1).getTitulo();
	}

	// 5. Devuelva el libro con más páginas.
	public Libro libroConMasPaginas() {
		if (this.libros.size() == 0)
			return null;
		Libro libroGordo = this.libros.get(0);
		
		for (Libro cl : libros)
			if (cl.getCantidadDePaginas() > libroGordo.getCantidadDePaginas())
				libroGordo = cl;

		return libroGordo;
	}

	// 6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		if (this.libros.size() == 0)
			return 0;
		int contador = 0;
		for (Libro cl : libros)
			if (cl.getAutor().equals(autor))
				contador++;
		return contador;
	}

	// 7. Devuelva un arreglo con todos los Libros de un autor que se pasa por
	// parámetro.
	public Libro[] librosDelAutor(String autor) {
		int cuantos = this.cuantosLibrosDelAutor(autor);
		Libro [] aux = new Libro[cuantos];
		int posAux = 0;
		for (Libro cl : libros)
			if (cl.getAutor().equals(autor)) {
				aux[posAux] = cl;
				posAux++;
			}
		return aux;
	}

	// 8. Calcule el tiempo (en minutos) que llevaría leer todos los libros,
	// asumiendo que se tarda 1 minuto por página.
	public int tiempoEnLeetTodosLosLibros() {
		int acum = 0;
		for (Libro cl : libros) {
			acum += cl.getCantidadDePaginas();
		}
		return acum;
	}

	// 9. Informe por pantalla la cantidad de libros que hay por cada Genero
	// literario.
	public void librosPorGeneroLiterario() {
		
		Genero generos[] = Genero.values();
		int[] contadores = new int[generos.length];
		int pos;
		for (Libro cl : libros) {
			pos = cl.getGenero().ordinal();
			contadores[pos]++;
		}
		
		for(int i=0; i< generos.length; i++) {
			System.out.println(generos[i] + "\t" + contadores[i]);
		}

	}
	

}

package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	@Test
	void bibliotecaCon3Libros() {
		Biblioteca b = new Biblioteca(3);
		assertEquals(0, b.cuantosLibros());
		b.agregarLibro("Rayuela", "Julio Cortazar", Genero.NOVELA, 200);
		assertEquals(1, b.cuantosLibros());
		b.agregarLibro("El Aleph", "Jorge Luis Borges", Genero.NOVELA, 250);
		b.agregarLibro("Moby Dick", "Melville", Genero.NOVELA, 2000);
		assertEquals(3, b.cuantosLibros());
		assertEquals("Rayuela", b.libroEnLaPosicion(1));
		Libro esperado = new Libro("Moby Dick", "Melville", Genero.NOVELA, 2000);
		Libro obtenido = b.libroConMasPaginas();
		assertEquals(esperado, obtenido);
		assertEquals(1, b.cuantosLibrosDelAutor("Jorge Luis Borges"));
		
		Libro[] listaDeBorges = new Libro[1];
		listaDeBorges[0]=new Libro("El Aleph", "Jorge Luis Borges", Genero.NOVELA, 250);
		assertArrayEquals(listaDeBorges, b.librosDelAutor("Jorge Luis Borges"));
		
	}
	
	@Test
	void cuantosLibrosPorGeneroTest(){
		Biblioteca b = new Biblioteca(10);
		b.agregarLibro("Rayuela", "Julio Cortazar", Genero.NOVELA, 200);
		b.agregarLibro("El Aleph", "Jorge Luis Borges", Genero.NOVELA, 250);
		b.agregarLibro("Moby Dick", "Melville", Genero.NOVELA, 2000);
		b.agregarLibro("Los Güemes", "Felipe Pigna", Genero.HISTORIA, 500);
		b.agregarLibro("Adios al frío", "Elvira Sastre", Genero.POESIA, 500);
		b.librosPorGeneroLiterario();
		
	}

}

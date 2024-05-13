package pilasYcolas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvertidaTest {

	@Test
	void test() {
		Palindromo p = new Palindromo();
		assertEquals("", p.invertirCadena(""));
		assertEquals("a", p.invertirCadena("a"));
		assertEquals("odnuM aloH", p.invertirCadena("Hola Mundo"));
		assertTrue(p.esPalindromo("oso"));
		assertTrue(p.esPalindromo(""));
		assertTrue(p.esPalindromo("o"));
		assertTrue(p.esPalindromo("neuquen"));
		assertTrue(p.esPalindromo("Neuquen"));
		
	}

}

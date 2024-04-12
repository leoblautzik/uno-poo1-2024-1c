package verificadorDeOrden;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificadorTest {

	@Test
	void todosIgualesTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {1,1,1,1,1,1,1,1,1};
		assertTrue(vdo.verificar(a));
	}
	
	@Test
	void unoSoloTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {1};
		assertTrue(vdo.verificar(a));
	}
	
	@Test
	void arrayVacioTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {};
		assertTrue(vdo.verificar(a));
	}
	
	@Test
	void todosNegativosDecrecienteTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {-1, -2, -3};
		assertFalse(vdo.verificar(a));
	}
	
	@Test
	void todosNegativosCrecienteTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {-3, -2, -1};
		assertTrue(vdo.verificar(a));
	}
	
	@Test
	void algunosRepetidosTest() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] a = {10, 11, 12, 12, 13, 100};
		assertTrue(vdo.verificar(a));
	}

}

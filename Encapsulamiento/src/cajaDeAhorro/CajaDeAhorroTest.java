package cajaDeAhorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {

	@Test
	void creoCajaDeAhorroMiaTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		assertEquals("Profe Leo", miCuentita.obtenerTitular());
		assertEquals(0.00, miCuentita.consultarSaldo());
	}
	
	@Test
	void depositarValorCorrectoTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		miCuentita.depositar(100000.00);
		assertEquals(100000.00, miCuentita.consultarSaldo());
	}
	
	@Test
	void depositarValorInCorrectoTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		assertThrows(Error.class, () -> {
			miCuentita.depositar(0.00);
			miCuentita.depositar(-10.00);

		});
	}
	
	@Test
	void extraerConSaldoSuficienteTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		miCuentita.depositar(100000.00);
		miCuentita.extraer(15000.00);
		assertEquals(85000.00, miCuentita.consultarSaldo());
	}
	
	@Test
	void extraerConSaldoJustitoTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		miCuentita.depositar(10000.00);
		miCuentita.extraer(10000.00);
		assertEquals(0.00, miCuentita.consultarSaldo());
	}
	
	@Test
	void extraerConSaldoInsuficienteTest() {
		CajaDeAhorro miCuentita = new CajaDeAhorro("Profe Leo");
		miCuentita.depositar(10000.00);
		assertThrows(Error.class, () -> {
			miCuentita.extraer(10000.01);
		});
	}
}

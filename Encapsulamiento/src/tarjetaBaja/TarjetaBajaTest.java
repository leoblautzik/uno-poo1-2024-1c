package tarjetaBaja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTest {

	@Test
	void creoTarjetaCon100peTest() {
		TarjetaBaja tb = new TarjetaBaja(100);
		assertEquals(100.0, tb.obtenerSaldo(), 0.001);
	}

	@Test
	void pagarViajeEnColectivoConSaldoSufiTest() {
		TarjetaBaja tb = new TarjetaBaja(100);
		tb.pagarViajeEnColectivo();
		assertEquals(78.50, tb.obtenerSaldo(), 0.001);
		assertEquals(1, tb.contarViajes());
		assertEquals(1, tb.contarViajesEnColectivo());
	}

	@Test
	void pagarViajeEnColectivoConSaldoJustitoTest() {
		TarjetaBaja tb = new TarjetaBaja(21.5);
		tb.pagarViajeEnColectivo();
		assertEquals(0, tb.obtenerSaldo(), 0.001);
	}

	@Test
	void pagarViajeEnColectivoConSaldoInsuficienteTest() {
		TarjetaBaja tb = new TarjetaBaja(20);
		assertThrows(Error.class, () -> {
			tb.pagarViajeEnColectivo();
		});
	}

	@Test
	void pagarViajeEnSubteConSaldoSufiTest() {
		TarjetaBaja tb = new TarjetaBaja(36);
		tb.pagarViajeEnSubte();
		double esperado = 36 - TarjetaBaja.PRECIO_SUBTE;
		assertEquals(esperado, tb.obtenerSaldo(), 0.001);
		assertEquals(1, tb.contarViajes());
		assertEquals(1, tb.contarViajesEnSubte());
		
		assertThrows(Error.class, () -> {
			tb.pagarViajeEnSubte();
		});
		//16.5
		tb.cargar(100);
		tb.pagarViajeEnSubte();
		assertEquals(97.00, tb.obtenerSaldo());
		
		
	}

}

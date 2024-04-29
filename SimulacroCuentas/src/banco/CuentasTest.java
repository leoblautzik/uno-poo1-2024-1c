package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentasTest {

	@Test
	void crearCuentasTest() {

		Cuenta ca = new CuentaAhorro(16987655);
		Cuenta cc = new CuentaCorriente(30222333, 1000.00);

		assertEquals(0.0, ca.getSaldo());
		assertEquals(0.0, cc.getSaldo());

		ca.depositar(1500.00);
		cc.depositar(1200.00);

		assertEquals(1500.0, ca.getSaldo());
		assertEquals(1200.0, cc.getSaldo());
		Error throw1 = assertThrows(Error.class, () -> ca.extraer(1600.00));

		cc.extraer(1000.00);
		assertEquals(200.0, cc.getSaldo());
		cc.extraer(1000.00);
		assertEquals(-800.0, cc.getSaldo());
		
		Error throw2 = assertThrows(Error.class, () -> cc.extraer(201.00));
		
	}
	
	@Test
	void transferirTest() {
		
		Cuenta ca = new CuentaAhorro(16987655);
		Cuenta cc = new CuentaCorriente(30222333, 1000.00);
		

		ca.depositar(1500.00);
		cc.depositar(1200.00);
		
		cc.transferir(ca, 500.00);
		
		assertEquals(2000.00, ca.getSaldo());
		assertEquals(700.0, cc.getSaldo());
		
		cc.transferir(ca, 1500.00);
		assertEquals(-800.0, cc.getSaldo());
		
		Cuenta.transferir(ca, cc, 1200.0);
		assertEquals(400.0, cc.getSaldo());
		
	}

}

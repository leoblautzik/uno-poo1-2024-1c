package viaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ViajeTest {

	@Test
	void duracionTest() {
		Viaje porBuenosAires = new Viaje(5);
		porBuenosAires.registrarEscala("Tandil", 3);
		porBuenosAires.registrarEscala("Balcarce", 1);
		porBuenosAires.registrarEscala("Mar del Plata", 5);
		int esperado = 9;
		int obtenido = porBuenosAires.duracionTotal();
		assertEquals(esperado, obtenido);

	}
	
	@Test
	void duracionSinEscalasTest() {
		assertThrows(Error.class, () -> {
			Viaje porBuenosAires = new Viaje(0);
		});
	
	}
	
	@Test
	void duracionEntreTest() {
		Viaje porBuenosAires = new Viaje(5);
		porBuenosAires.registrarEscala("Tandil", 3);
		porBuenosAires.registrarEscala("Balcarce", 1);
		porBuenosAires.registrarEscala("Mar del Plata", 5);
		int esperado = 2;
		int obtenido = porBuenosAires.contarEscalasConDuracionEntre(2, 5);
		assertEquals(esperado, obtenido);
		porBuenosAires.ciudadMasDuracion();

	}

}

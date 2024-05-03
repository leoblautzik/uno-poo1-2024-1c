package juegoEstrategia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CombatesTest {

	@Test
	void soldadosTest() {
		Soldado rambo = new Soldado(0);
		Soldado conan = new Soldado(0);
		rambo.atacar(conan);
		assertEquals(90, rambo.getEnergia());
		assertEquals(190, conan.getSalud());
		while(rambo.puedeAtacar(conan)) {
			rambo.atacar(conan);
		}
		assertEquals(0, rambo.getEnergia());
		assertEquals(100, conan.getSalud());
		
		while(conan.puedeAtacar(rambo)) {
			conan.atacar(rambo);
		}
		assertEquals(0, conan.getEnergia());
		assertEquals(100, rambo.getSalud());
		
		assertFalse(conan.puedeAtacar(rambo));
		assertFalse(rambo.puedeAtacar(conan));
		
	}
	
	@Test
	void arqueroTest() {
		Arquero legolas = new Arquero(5);
		Soldado conan = new Soldado(1);
		
		legolas.atacar(conan);
		
		assertEquals(19, legolas.getFlechas());
		assertEquals(195, conan.getSalud());
		
		
	}
}

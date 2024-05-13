package club;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClubTest {

	@Test
	void FutbolistaTest() {
		Deportista.setCuotaBase(10000);
		Futbolista kempes = new Futbolista(123, 3);
		assertEquals(13000.00, kempes.getCuotaMensual());
			
	}
	@Test 
	void TenistaTest() {
		Deportista.setCuotaBase(10000);
		Tenista vilas = new Tenista(124, 5);
		assertEquals(12500.00, vilas.getCuotaMensual());
	}
	
	@Test 
	void CuotaTest() {
		Deportista.setCuotaBase(10000);
		Futbolista kempes = new Futbolista(123, 3);
		Tenista vilas = new Tenista(124, 5);
		Deportista.setCuotaBase(15000);
		assertEquals(19500.00, kempes.getCuotaMensual());
		assertEquals(18750.00, vilas.getCuotaMensual());
	}
		@Test
		void clubTest() {
			Club elProgreso = new Club();
			elProgreso.setCuotaBase(10000.00);
			Futbolista kempes = new Futbolista(123, 3);
			Tenista vilas = new Tenista(124, 5);
			elProgreso.agregarSocio(vilas);
			elProgreso.agregarSocio(kempes);
			assertEquals(25500.00, elProgreso.getTotalMensualDeCuotas());
			elProgreso.setCuotaBase(15000.00);
			assertEquals(38250.00, elProgreso.getTotalMensualDeCuotas());
			elProgreso.listarPlanillaDesocios();
		}
	}
	

	



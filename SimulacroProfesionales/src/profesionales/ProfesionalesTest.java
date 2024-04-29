package profesionales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfesionalesTest {

	@Test
	void medicoTest() {
		
		Medico m = new Medico("Carlos", "Fernandez");
		assertEquals(500000, m.getHonorarioMensual());
		
	}
	
	@Test
	void CirujanoTest() {
		
		Cirujano ciruja = new Cirujano("Fernando" , "Juares");
		assertEquals(625000, ciruja.getHonorarioMensual());
		
	}
	
	@Test
	void CirujanoCardioTest() {
		
		CirujanoCardiovascular cirujaCardio = new CirujanoCardiovascular("Fernando" , "Juares");
		assertEquals(781250, cirujaCardio.getHonorarioMensual());
		
	}
	

}

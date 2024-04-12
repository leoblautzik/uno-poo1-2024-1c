package listaDePacientes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import viaje.Viaje;

class ListaDePacientesTest {

	@Test
	void agregarPacienteTest() {
		ListaDePacientes ldp = new ListaDePacientes(5);
		ldp.agregarPaciente("Juancito", 20);
		ldp.agregarPaciente("Miryam", 15);
		assertEquals("Juancito", ldp.getNombre(1));
		assertEquals("Miryam", ldp.getNombre(2));
		
		assertThrows(Error.class, () -> {
			assertEquals("Miryam", ldp.getNombre(3));
			assertEquals("Miryam", ldp.getNombre(0));
		});
		assertEquals(35, ldp.getTiempoDeEspera());
		assertEquals(17, ldp.getDuracionPromedio());
		
		
	}

}

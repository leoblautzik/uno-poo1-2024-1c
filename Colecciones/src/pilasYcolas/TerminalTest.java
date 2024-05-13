package pilasYcolas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TerminalTest {

	@Test
	void test() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "abcd&dfr//g";
		assertEquals("dg", tdt.procesar(tira));
		
		tira = "abc/d/e////";
		assertEquals("", tdt.procesar(tira));
		
		tira = "&&&&&";
		assertEquals("", tdt.procesar(tira));
		
	}

}

package pilasYcolas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpresionBalanceadaTest {

	@Test
	void test() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		assertTrue(eb.estaBalanceada("[]{((()))}"));
		assertFalse(eb.estaBalanceada("[{((()))}"));
		assertTrue(eb.estaBalanceada(""));
		assertFalse(eb.estaBalanceada("[{(((])))}"));
		
	}

}

package segundoParcial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class ListasGenericasTest {

	@Test
	void integerTest() {
		
		ListasGenericas<Integer> lg = new ListasGenericas<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		
		l1.add(1);
		l1.add(11);
		l1.add(-1);
		l2.add(1);
		l2.add(11);
		l2.add(-1);
		l2.add(20);
		l2.add(100);
		
		assertTrue(lg.todosLosL1EstanEnL2(l1, l2));
		assertTrue(lg.otraVersionTododosLosL1EstanEnL2(l1, l2));
		assertTrue(lg.todosLosL1EstanEnL2(l3, l2));
		assertFalse(lg.todosLosL1EstanEnL2(l2, l3));
	}
	
	@Test
	void stringTest() {
		
		ListasGenericas<String> lg = new ListasGenericas<String>();
		LinkedList<String> l1 = new LinkedList<String>();
		LinkedList<String> l2 = new LinkedList<String>();
		LinkedList<String> l3 = new LinkedList<String>();
		
		l1.add("1");
		l1.add("11");
		l1.add("-1");
		l2.add("1");
		l2.add("11");
		l2.add("-1");
		l2.add("20");
		l2.add("100");
		
		assertTrue(lg.todosLosL1EstanEnL2(l1, l2));
		assertTrue(lg.otraVersionTododosLosL1EstanEnL2(l1, l2));
		assertTrue(lg.todosLosL1EstanEnL2(l3, l2));
		assertFalse(lg.todosLosL1EstanEnL2(l2, l3));
	}

	

}

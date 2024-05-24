package pilasYcolas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExpresionBalanceada {

	public boolean estaBalanceada(String exp) {
		PilaL<Character> pila = new PilaL<Character>();
		for (Character c : exp.toCharArray()) {
			if (esDeAbrir(c)) {
				pila.push(c);
			} else if (!sonParcito(c, pila.pop())) {
				return false;
			}
		}
		return pila.isEmpty();
	}

	private boolean esDeAbrir(Character c) {
		Set<Character> s = new HashSet<Character>();
		s.add('[');
		s.add('{');
		s.add('(');
		return s.contains(c);
	}

	private boolean sonParcito(Character deCerrar, Character deAbrir) {
		Map<Character, Character> mapa = new HashMap<Character, Character>();
		mapa.put('}', '{');
		mapa.put(']', '[');
		mapa.put(')', '(');

		return mapa.get(deCerrar) == deAbrir;

	}

}

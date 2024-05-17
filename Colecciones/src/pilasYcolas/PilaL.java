package pilasYcolas;

import java.util.LinkedList;

public class PilaL<T> implements Pila<T> {
	
	private LinkedList<T> lista = new LinkedList<T>();

	@Override
	public T pop() {
		if(lista.isEmpty())
			throw new Error("Pila vacía");
		return lista.removeFirst();
	}

	@Override
	public void push(T dato) {
		lista.addFirst(dato);
	}

	@Override
	public T peek() {
		if(lista.isEmpty())
			throw new Error("Pila vacía");
		return lista.getFirst();
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

}

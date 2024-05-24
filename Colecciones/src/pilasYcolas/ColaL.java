package pilasYcolas;

import java.util.LinkedList;

public class ColaL<T> implements Cola<T> {
	
	private LinkedList<T> lista = new LinkedList<T>();

	@Override
	public void offer(T dato) {
		lista.addLast(dato);
	}

	@Override
	public T poll() {
		if(lista.isEmpty())
			throw new Error("Cola vacía");
		return lista.removeFirst();
	}

	@Override
	public T peek() {
		if(lista.isEmpty())
			throw new Error("Cola vacía");
		return lista.getFirst();
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}

}

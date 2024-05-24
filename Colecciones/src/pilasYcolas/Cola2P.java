package pilasYcolas;

public class Cola2P<T> implements Cola<T> {

	private PilaL<T> pilaA = new PilaL<T>();
	private PilaL<T> pilaB = new PilaL<T>();

	@Override
	public void offer(T dato) {
		pilaA.push(dato);
	}

	@Override
	public T poll() {
		if (this.isEmpty())
			throw new Error("Cola vacia");

		if (pilaB.isEmpty()) {
			pasarDeAaB();
		}
		return pilaB.pop();
	}

	private void pasarDeAaB() {
		while (!pilaA.isEmpty())
			pilaB.push(pilaA.pop());
	}

	@Override
	public T peek() {
		if (this.isEmpty())
			throw new Error("Cola vacia");

		if (pilaB.isEmpty()) {
			pasarDeAaB();
		}
		return pilaB.peek();
	}

	@Override
	public boolean isEmpty() {
		return pilaA.isEmpty() && pilaB.isEmpty();
	}
	
	

}

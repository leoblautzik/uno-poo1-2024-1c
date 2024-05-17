package pilasYcolas;

import java.util.Stack;

public class PilaS<T> implements Pila<T> {

	private Stack<T> stack = new Stack<T>();

	@Override
	public T pop() {
		if (stack.isEmpty())
			throw new Error("Pila vacía");
		return stack.pop();
	}

	@Override
	public void push(T dato) {
		stack.push(dato);

	}

	@Override
	public T peek() {
		if (stack.isEmpty())
			throw new Error("Pila vacía");
		return stack.peek();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

}

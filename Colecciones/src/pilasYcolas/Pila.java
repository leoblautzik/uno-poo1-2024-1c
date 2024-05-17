package pilasYcolas;

public interface Pila<T> {
	
	public T pop();
	public void push(T dato);
	public T peek();
	public boolean isEmpty();

}

package pilasYcolas;
/**
 * En un supermercado se mantiene una cola A con diversos clientes de los 
 * que se conoce número de ubicación en la cola y cantidad de productos 
 * que lleva. Se abre una nueva cola B para clientes que llevan menos de 
 * 5 productos. Usted debe dejar en la cola A los clientes que llevan más 
 * de 5 o hasta 5 productos en el orden en que estaban, y en la cola B 
 * los que compran menos de 5 artículos, respetando el orden que tenían 
 * en la cola A. En ambas colas reasignar un nuevo número de ubicación.
 */
public class Supermercado {

	private Cola<Cliente> colaA = new ColaL<Cliente>();
	private Cola<Cliente> cajaRapida = new ColaL<Cliente>();

	public void agregarClientes(Cliente c) {
		this.colaA.offer(c);
	}

	public void abrirCajaRapida(int productos) {
		Cola<Cliente> aux = new ColaL<Cliente>();
		int posAux = 1;
		int posB = 1;
		while (!colaA.isEmpty()) {
			if (colaA.peek().getCantProductos() >= productos) {
				colaA.peek().setPosicion(posAux++);
				aux.offer(colaA.poll());
			} else {
				colaA.peek().setPosicion(posB++);
				this.cajaRapida.offer(colaA.poll());
			}
		}
		this.colaA = aux;
	}

	public static void main(String[] args) {
		Supermercado elChino = new Supermercado();

		elChino.agregarClientes(new Cliente(10, 1));
		elChino.agregarClientes(new Cliente(5, 2));
		elChino.agregarClientes(new Cliente(4, 3));
		elChino.agregarClientes(new Cliente(9, 4));
		elChino.agregarClientes(new Cliente(3, 5));
		elChino.agregarClientes(new Cliente(1, 6));

		elChino.abrirCajaRapida(5);
		System.out.println("Cola A");
		while (!elChino.colaA.isEmpty()) {
			System.out.println(elChino.colaA.poll());
		}
		System.out.println("Caja rápida");
		while (!elChino.cajaRapida.isEmpty()) {
			System.out.println(elChino.cajaRapida.poll());
		}
	}
}

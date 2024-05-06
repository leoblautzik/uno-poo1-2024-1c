package juegoEstrategia;
/** Un caballo se pone rebelde luego de 3 ataques, 
* y puede calmarse si recibe una poción de agua.
*/

public class Caballo implements BebedorDeAgua {

	private int ataques = 0;

	public boolean estaRebelde() {
		return ataques >= 3;
	}
	
	public void sumarAtaque() {
		this.ataques ++;
	}

	@Override
	public void beberAgua() {
		this.ataques = 0;
	}

}

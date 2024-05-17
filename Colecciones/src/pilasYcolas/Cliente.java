package pilasYcolas;

public class Cliente {
	private int cantProductos;
	private int posicion;
	
	
	public Cliente(int cantProductos, int posicion) {
		super();
		this.cantProductos = cantProductos;
		this.posicion = posicion;
	}


	public int getCantProductos() {
		return cantProductos;
	}


	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	@Override
	public String toString() {
		return "[cantProductos=" + cantProductos + ", posicion=" + posicion + "]";
	}



	
	
	
	

}

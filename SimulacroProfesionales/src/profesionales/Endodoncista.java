package profesionales;

public class Endodoncista extends Dentista {

	public Endodoncista(String nombre, String apellido) {
		super(nombre, apellido);
	}

	@Override
	public double getHonorarioMensual() {
		return super.getHonorarioMensual() * 1.25;
	}

}

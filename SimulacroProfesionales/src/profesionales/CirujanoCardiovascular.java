package profesionales;

public class CirujanoCardiovascular extends Cirujano {

	public CirujanoCardiovascular(String nombre, String apellido) {
		super(nombre, apellido);

	}

	@Override
	public double getHonorarioMensual() {
		return super.getHonorarioMensual() * 1.25;
	}

}

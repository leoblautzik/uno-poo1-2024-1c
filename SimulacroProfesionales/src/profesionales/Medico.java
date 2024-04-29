package profesionales;

public class Medico extends Profesional {

	public Medico(String nombre, String apellido) {
		super(nombre, apellido);
		
	}

	@Override
	public double getHonorarioMensual() {
		return super.getBasico();
	}

}

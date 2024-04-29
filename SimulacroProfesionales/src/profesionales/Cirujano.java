package profesionales;

public class Cirujano extends Medico {

	public Cirujano(String nombre, String apellido) {
		super(nombre, apellido);
		
	}
	
	@Override
	public double getHonorarioMensual() {
		return super.getHonorarioMensual() * 1.25;
	}

}

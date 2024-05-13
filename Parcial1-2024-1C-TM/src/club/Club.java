package club;

import java.util.ArrayList;
import java.util.Collections;

public class Club {
	
	private ArrayList<Deportista> socios ;
	
	public Club() {
		this.socios = new ArrayList<Deportista>();
	}
	
	public void setCuotaBase(double cb) {
		Deportista.setCuotaBase(cb);
	}
	
	//Agrega el Deportista d a la lista de socios
	public void agregarSocio(Deportista d){
		socios.add(d);
	}
	
	// Retorna el importe total recaudado por todos los socios del club
	public double getTotalMensualDeCuotas(){
		double total = 0;
		for(Deportista d : socios) {
			total += d.getCuotaMensual();
		}
		return total;
	}
	
	// Emite por consola el listado de los socios de a uno por línea, 
	// mostrando en cada una el número de socio y el 
	// valor de la cuota que abona. 
	// Debe estar ordenado por número de socio
	public void listarPlanillaDesocios(){
		Collections.sort(this.socios);
		for(Deportista d : socios) {
			System.out.println(d);
		}
	}





}

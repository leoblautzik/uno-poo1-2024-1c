package guiaDeRepaso;

public class Ejercicio05 {
	public static void main(String[] args) {
		int fecha = 20240101;
		int anio = fecha/10000;
		int dia = fecha % 100; 
		int mes = fecha /100 % 100;
		System.out.println("Año: " + anio + ", Mes: " + mes + ", Día: " +dia );
	}
}

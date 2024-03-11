package guiaDeRepaso;

public class Ejercicio06 {

	public static void main(String[] args) {
		int mayor, menor;
		int a = 100;
		int b = 14;
		
		mayor = a;
		menor = b;

		if (a < b) {
			mayor = b;
			menor = a;
		}

		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
		

	}

}

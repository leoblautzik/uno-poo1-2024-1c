package guiaDeRepaso;

public class Ejercicio07 {
	public static void main(String[] args) {
		int mayor, medio, menor;
		int a = 7;
		int b = 5;
		int c = 1;

		mayor = a;
		if (b > mayor) {
			medio = a;
			mayor = b;
		}
		else medio = b;
		if (c>mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		}
		else if(c > medio) {
			menor = medio;
			medio = c;
		}
		else 
			menor = c;
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Medio: " + medio);
		System.out.println("Menor: " + menor);

	}


	
}

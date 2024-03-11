package guiaDeRepaso;

public class Ejercicio07ConIntercambios {
	
	public static void main(String[] args) {
		mayorMedioMenor(1, 5, 7);
		mayorMedioMenor(1, 7, 5);
		mayorMedioMenor(5, 1, 7);
		mayorMedioMenor(5, 7, 1);
		mayorMedioMenor(7, 5, 1);
		mayorMedioMenor(7, 1, 5);
	}
	

	public static void mayorMedioMenor(int a, int b, int c) {
			int mayor, medio, menor, aux;

			mayor = a;
			medio = b;
			menor = c;
			
			if(medio < menor) {
				aux = medio;
				medio = menor;
				menor = aux;
			}
			
			if(mayor < medio) {
				aux = mayor;
				mayor = medio;
				medio = aux;
			}
			
			if(medio < menor) {
				aux = medio;
				medio = menor;
				menor = aux;
			}
			
			System.out.println("Mayor: " + mayor);
			System.out.println("Medio: " + medio);
			System.out.println("Menor: " + menor);

	}

}

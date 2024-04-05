package guiaDeRepaso;

/**
 * Implementar una función que reciba como parámetro un arreglo de enteros y
 * muestre por pantalla cuántas veces se repite cada uno. El arreglo no está
 * ordenado. Se garantiza que los números están comprendidos entre 0 y 100.
 */

public class Ejercicio26 {

	public static void frecuencias(int[] v) {
		int[] frecuencias = new int[101];
		for (int i = 0; i < v.length; i++) {
			frecuencias[v[i]]++;
		}

		for (int i = 0; i < frecuencias.length; i++) {
			if (frecuencias[i] != 0) {
				System.out.println("El valor " + i + 
						" se repite " + 
						frecuencias[i] + 
						" veces");
			}
		}
	}

	public static void main(String[] args) {
		int[] repetidos = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
		frecuencias(repetidos);
		int[]maligno = {};
		frecuencias(maligno);
	}
}

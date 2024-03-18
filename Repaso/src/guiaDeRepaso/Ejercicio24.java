package guiaDeRepaso;
/**
 * Escribir una función que reciba un arreglo de enteros y 
 * devuelva true si el arreglo está ordenado de mayor a menor y 
 * false si está desordenado.
 */
public class Ejercicio24 {
		
//	public static boolean estaOrdenado(int [] v) {
//		for(int i = 0; i < v.length - 1; i++) {
//			if(v[i] < v[i+1]) {
//				return false;
//			}
//		}
//		return true;
//	}
	public static boolean estaOrdenado(int [] v) {
		boolean ordenado = true;
		int i = 0;
		while(i < v.length -1 && ordenado) {
			ordenado = v[i] >= v[i+1];
			i++;
		}
		return ordenado;
	}
	

	public static void main(String[] args) {
		
		int[] vectorcito = {9,8,7,6,5,4,3,2,1};
		int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int b [] = {3};
		int[] c = {};
		int[] d = {7,6,5,4,3,2,9};
		int[] e = {-1,7,6,5,4,3,2};
		System.out.println(estaOrdenado(vectorcito));
		System.out.println(estaOrdenado(a));
		System.out.println(estaOrdenado(b));
		System.out.println(estaOrdenado(c));
		System.out.println(estaOrdenado(d));
		System.out.println(estaOrdenado(e));

	}

}

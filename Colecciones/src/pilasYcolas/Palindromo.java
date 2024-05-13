package pilasYcolas;

import java.util.Stack;

/**
 * Implementar un metodo que reciba un string y devuelva true si
 * es palindromo;
 * 
 * Implementar un metodo que reciba un string 
 * y lo devualva invertido.
 */
public class Palindromo {
	
	public boolean esPalindromo(String texto) {
		texto = texto.toLowerCase();
		
		return texto.endsWith(invertirCadena(texto));
	}
	
	public String invertirCadena(String cadena) {
		String invertida = "";
		Stack<Character> pila = new Stack<Character>();
		
		for(Character cadaChar : cadena.toCharArray()) {
			pila.push(cadaChar);
		}
		
		while(!pila.isEmpty()) {
			invertida += pila.pop();
		}
		
		return invertida;
	}

}

package pilasYcolas;

import java.util.Stack;

/**
 * En una terminal de teletipo existe un carácter de retroceso que permite
 * cancelar el último carácter. Por ejemplo: si el carácter de retroceso es /,
 * entonces la línea abc/d//e será interpretada como ae. Existe también un
 * carácter anulador que elimina todos los caracteres ingresados hasta el
 * momento, suponga que ese carácter es &. ejecute las operaciones indicadas si
 * se encuentra con el carácter / o el &. Debe por último retornar la tira
 * resultante.
 */

public class TerminalDeTeletipo {

	public String procesar(String tira) {
		String resultado = "";
		Stack<Character> pilaIn = new Stack<Character>();
		Stack<Character> pilaOut = new Stack<Character>();

		for (Character cadaChar : tira.toCharArray()) {
			if (cadaChar == '&') {
				while (!pilaIn.empty()) {
					pilaIn.pop();
				}
			} else if (cadaChar == '/') {
				if (!pilaIn.empty()) {
					pilaIn.pop();
				}
			} else
				pilaIn.push(cadaChar);

		}
		while (!pilaIn.empty()) {
			pilaOut.push(pilaIn.pop());
		}

		while (!pilaOut.empty()) {
			resultado += pilaOut.pop();
		}
		return resultado;
	}
}

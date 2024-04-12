package verificadorDeOrden;

public class VerificadorDeOrden {

	boolean verificar(int[] enteros) {
		for (int i = 0; i < enteros.length - 1; i++)
			if (enteros[i] > enteros[i + 1])
				return false;

		return true;
	}

}

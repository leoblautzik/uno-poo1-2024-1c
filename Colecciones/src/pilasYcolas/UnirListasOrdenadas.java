package pilasYcolas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnirListasOrdenadas {
	
	public ArrayList<Integer> unirListas(List<Integer> l1, List<Integer> l2) {
		ArrayList<Integer> listaUnida = new ArrayList<Integer>();
		
		listaUnida.addAll(l1);
		listaUnida.addAll(l2);
		
		Collections.sort(listaUnida);
				
		return listaUnida;
		
	}

}

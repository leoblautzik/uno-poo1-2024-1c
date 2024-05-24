package pilasYcolas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class EliminarDuplicados {
	
	public LinkedList<Integer> sinDuplicados(List<Integer> l){
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList<Integer> aux = new LinkedList<Integer>();
		
		for(Integer cu : l) {
			set.add(cu);
		}
		
		for(Integer cu : set) {
			aux.add(cu);
		}
		
		return aux;
	}

}

package segundoParcial;

import java.util.List;

public class ListasGenericas<T> {

	public boolean todosLosL1EstanEnL2(List<T> l1, List<T> l2) {
		for (T ce : l1) {
			if (!l2.contains(ce)) {
				return false;
			}
		}
		return true;
		
	}
	
	public boolean otraVersionTododosLosL1EstanEnL2(List<T> l1, List<T> l2) {
		return l2.containsAll(l1);
	}
		
	
	

}

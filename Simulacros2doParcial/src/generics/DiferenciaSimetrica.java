package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiferenciaSimetrica<T> {
	
	public List<T> diferenciaSimetrica(List<T> l1, List<T> l2){
		LinkedList<T> ds = new LinkedList<T>();
		
		for (T cl1 : l1) {
			if(!l2.contains(cl1)) {
				ds.add(cl1);
			}
		}
		
		for (T cl2 : l2) {
			if(!l1.contains(cl2)) {
				ds.add(cl2);
			}
		}
		
		
		return ds;
	}
	
	public List<T> diferencia(List<T> l1, List<T> l2){ 
		LinkedList<T> diferencia = new LinkedList<T>();
		for (T cl1 : l1) {
			if(!l2.contains(cl1)) {
				diferencia.add(cl1);
			}
		}
		
		return diferencia;
	}

	
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		LinkedList<String> l2 = new LinkedList<String>();
		
		
		l1.add("Hola");
		l1.add("Mundo");
		l2.add("Hola");
		l2.add("Java");
		
		DiferenciaSimetrica<String> dss = new DiferenciaSimetrica<String>();
		
		System.out.println(dss.diferenciaSimetrica(l1, l2));
		System.out.println(dss.diferencia(l1, l2));
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		
		l3.add(1);
		l3.add(3);
		l3.add(5);
		l3.add(7);
		l4.add(1);
		l4.add(3);
		l4.add(9);
		
		DiferenciaSimetrica<Integer> dsi = new DiferenciaSimetrica<Integer>();
		
		System.out.println(dsi.diferenciaSimetrica(l3, l4));
		System.out.println(dsi.diferencia(l3, l4));
		
	}

}

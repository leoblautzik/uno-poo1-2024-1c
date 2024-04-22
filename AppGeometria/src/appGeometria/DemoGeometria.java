package appGeometria;

public class DemoGeometria {

	public static void main(String[] args) {
		Segmento s1 = new Segmento(0,4,4,0);
		Segmento s2 = new Segmento(0,1,1,0);
		
		System.out.println(s1.esParaleloA(s2));
		System.out.println(s2.esParaleloA(s1));
		
		s2.desplazar(5.0, -3.0);
		System.out.println(s1.esParaleloA(s2));
		System.out.println(s2.esParaleloA(s1));
		
		System.out.println(s1.getLargo());
		System.out.println(s1.getLargo());
	}

}

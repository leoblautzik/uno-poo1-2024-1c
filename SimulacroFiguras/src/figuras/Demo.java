package figuras;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {

		Figura circulito = new Circulo(2);
		Figura cuadradito = new Cuadrado(4);
		Figura rectangulito = new Rectangulo(2, 6);
		Figura elipsita = new Elipse(2, 4);
		Figura triangulito = new Triangulo(2, 6);

		ArrayList<Figura> figuritas = new ArrayList<Figura>();
		figuritas.add(elipsita);
		figuritas.add(circulito);
		figuritas.add(rectangulito);
		figuritas.add(triangulito);
		figuritas.add(cuadradito);
		
		for(Figura f : figuritas) {
			System.out.println(f.getArea());
		}
		
		Collections.sort(figuritas);
		for(Figura f : figuritas) {
			System.out.println(f.getArea());
		}
		double areaTotal =0;
		for(Figura f : figuritas) {
			areaTotal += f.getArea();
		}
		
		System.out.println("Area total: " + areaTotal);
		
	}
}

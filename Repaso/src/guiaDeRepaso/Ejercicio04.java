package guiaDeRepaso;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un entero positivo: ");
		int numerito = sc.nextInt();
		if (numerito % 2 == 0) {
			System.out.println("Es par!!");
		} else {
			System.out.println("Es impar!!");
		}

	}

}

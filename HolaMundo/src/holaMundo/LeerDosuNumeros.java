package holaMundo;

import java.util.Scanner;

public class LeerDosuNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese un entero: ");
		int a = sc.nextInt();
		System.out.print("ingrese otro entero: ");
		int b = sc.nextInt();
		int suma = a + b;
		System.out.println("La suma es: " + suma);
		sc.close();
	}
}

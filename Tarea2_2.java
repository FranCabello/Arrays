//Francisco Jos� Cabello Lij�, 1�DAM

import java.util.Arrays;
import java.util.Scanner;

public class Tarea2_2 {

	public static void main(String[] args) {
		int[] v;
		int tama, dato;

		// pido por teclado el tama�o del array y los n�meros por teclado
		Scanner sc = new Scanner(System.in);

		// vamos a pedir el tama�o del array
		System.out.print("Introduzca el tama�o del vector: ");
		tama = sc.nextInt();

		v = new int[tama];

		// vamos a pedir los n�meros por teclado y los guardamos en el array
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduzca n�mero que se guarda en v[" + i + "]= ");
			v[i] = sc.nextInt();
		}

		// vamos a pedir el n�mero a buscar por teclado
		System.out.print("Introduzca n�mero a buscar: ");
		dato = sc.nextInt();
		sc.close();

		// b�squeda binaria
		if (Arrays.binarySearch(v, dato) > 0) {
			System.out.println("El " + dato + " se encuentra en el vector/array");
		} else {
			System.out.println("El " + dato + "  no se encuentra en el vector/array");
		}

	}

}

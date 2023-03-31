//Francisco José Cabello Lijó, 1ºDAM

import java.util.Arrays;
import java.util.Scanner;

public class Tarea2_4 {

	public static void main(String[] args) {
		int[] v;
		int tama;

		Scanner sc = new Scanner(System.in);
		// vamos a pedir el tamaño del array
		System.out.print("Introduzca el tamaño del vector: ");
		tama = sc.nextInt();
		sc.close();

		v = new int[tama];

		// vamos a pedir los números por teclado y los guardamos en el array
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduzca número que se guarda en v[" + i + "]= ");
			v[i] = sc.nextInt();
		}
		// el array antes de ordenarse
		System.out.println("Los elementos del array antes de ordenarlos son: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();

		// la parte de ordenar el array 
		Arrays.sort(v);

		// el array despues de ordenarse
		System.out.println("Los elementos del array despues de ordenarlos son: ");
		for (int n : v) {
			System.out.println(n + " ");
		}

	}

}

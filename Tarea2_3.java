//Francisco Jos� Cabello Lij�, 1�DAM

import java.util.Arrays;
import java.util.Scanner;

public class Tarea2_3 {

	public static void main(String[] args) {
		int[] v1 = new int[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca n�mero: ");
			v1[i] = sc.nextInt();
		}

		System.out.println("Los elementos almacenados en el array son: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(v1[i] + " ");
		}

		int[] v2 = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca n�mero: ");
			v2[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Los elementos almacenados en el array son: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(v2[i] + " ");
		}

		if (Arrays.equals(v1, v2))
			System.out.println("Son iguales.");
		else
			System.out.println("No son iguales.");

	}

}

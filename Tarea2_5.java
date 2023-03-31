//Francisco Jos� Cabello Lij�, 1�DAM

import java.util.Arrays;

public class Tarea2_5 {

	// System.arraycopy
	public static void main(String[] args) {
		String a1[] = { "Badajoz", "C�ceres" };
		String[] a2 = new String[2];
		System.arraycopy(a1, 0, a2, 0, a1.length);

		// Arrays.copyOf
		int[] v = new int[] { 1, 2, 3 };

		for (int i = 0; i < v.length; i++)
			System.out.println(v[i] + " ");

		int[] copia = Arrays.copyOf(v, 3);

		for (int i = 0; i < copia.length; i++)
			System.out.println(copia[i] + " ");

	}
}

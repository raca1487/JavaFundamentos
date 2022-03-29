
public class MetodosAuxiliares {

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public static boolean esMultiploDe(int numero, int divisor) {
		return numero % divisor == 0;
	}

	public static void rellenaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}

	public static void rellenaArray(int[] array, int desde) {
		int i = 0;
		while (i < array.length) {
			array[i] = desde++;
			i++;
		}
	}

}

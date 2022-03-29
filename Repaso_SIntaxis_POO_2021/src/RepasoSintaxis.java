import java.util.Arrays;

public class RepasoSintaxis {

	public static void main(String[] args) {
		// 1
		int inicio = 4;
		int fin = 9;
		int suma = 0;

		int[] misNumeros = new int[10];

		// 2
		for (int i = inicio; i <= fin; i++) {
			suma = suma + i;
		}
		System.out.println("2.- EL total es: " + suma);
		suma = 0;

		// 3
		for (int i = inicio; i <= fin; i++) {
			if (esPar(i) == true) {
				suma += i;
			}
		}
		System.out.println("3.- El total es: " + suma);
		suma = 0;

		// 4
		int divisor = 3;
		for (int i = inicio; i <= fin; i++) {
			if (esMultiploDe(i, divisor)) {
				suma += i;
			}
		}
		System.out.println("4.- El total es: " + suma);
		suma = 0;

		// 6
		arrayMisNumeros(misNumeros);
		System.out.println("6.- " + Arrays.toString(misNumeros));

		// 7
		arrayMisNumeros(misNumeros, inicio);
		System.out.println("7.- " + Arrays.toString(misNumeros));

		// 8
		for (int i = 0; i <= misNumeros.length; i++) {
			if (esMultiploDe(i, divisor)) {
				suma = suma + 1;
			}
		}
		System.out.println("8.- Hay " + suma + " múltiplos de " + divisor + " entre " + inicio + " y " + (fin + inicio));

		// 9 - 10
		String numerosQueCumplen = "";
		for (int i = 0; i <= misNumeros.length; i++) {
			if (esMultiploDe(i, divisor) == false && esPar(i + 1)) {
				suma = suma + 1;
				numerosQueCumplen += i + ", ";
			}

		}
		System.out.println("9.- Hay " + suma + " NO múltiplos de " + divisor + " en \"posición par\"\n\t entre "
				+ inicio + " y " + (inicio + fin));
		System.out.println("10.- \\ En nuestro ejemplo son " + numerosQueCumplen + "\\");

	}

	// 3
	public static boolean esPar(int numero) {
		boolean esPar = false;
		if (numero % 2 == 0) {
			esPar = true;
		}
		return esPar;
	}

	// 4
	public static boolean esMultiploDe(int numero, int divisor) {
		return (numero % divisor == 0);
	}

	// 5
	public static void arrayMisNumeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}

	// 7
	public static void arrayMisNumeros(int[] array, int desde) {
		int i = 0;
		while (i < array.length) {
			array[i] = desde++;
			i++;
		}
	}
}

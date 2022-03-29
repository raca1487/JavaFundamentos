import java.util.Arrays;

public class Sintaxis2 {

	public static void main(String[] args) {
		// 1 Declaración de variables
		int inicio = 4;
		int fin = 9;
		int suma = 0;
		int divisor = 3;
		int tamano = 10;
		int[] misNumeros = new int[tamano];
		String frase = "Lorem ipsum dolor sit amet, consectetur adipiscing\r\n"
				+ "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut\r\n"
				+ "enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip\r\n"
				+ "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate\r\n"
				+ "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat\r\n"
				+ "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est\r\n" + "laborum";
		int contador = 0;
		
		int[] miVector = { 5, 14, 20, 31, 37, 44, 72, 80 };
		int[] miVectorAux = new int[miVector.length];

		// 2
		for (int i = inicio; i <= fin; i++) {
			suma += i;
		}
		System.out.println("2.- El total es: " + suma);
		suma = 0;
		// 3
		for (int i = inicio; i <= fin; i++) {
			if (MetodosAuxiliares.esPar(i)) {
				suma += i;
			}
		}
		System.out.println("3.- El  total es: " + suma);
		suma = 0;
		// 4
		for (int i = inicio; i <= fin; i++) {
			if (MetodosAuxiliares.esMultiploDe(i, divisor)) {
				suma += i;
			}
		}
		System.out.println("4.- El total es: " + suma);
		suma = 0;
		// 6
		MetodosAuxiliares.rellenaArray(misNumeros);
		System.out.println("6.- " + Arrays.toString(misNumeros));
		// 7
		MetodosAuxiliares.rellenaArray(misNumeros, inicio);
		System.out.println("7.- " + Arrays.toString(misNumeros));
		// 8
		for (int i = 0; i < misNumeros.length; i++) {
			if (MetodosAuxiliares.esMultiploDe(misNumeros[i], divisor)) {
				suma += 1;
			}
		}
		System.out
				.println("8.- Hay " + suma + " múltiplos de " + divisor + " entre " + inicio + " y " + (fin + inicio));
		suma = 0;
		// 9 - 10
		String numerosQueCumplen = "";
		for (int i = 0; i < misNumeros.length; i++) {
			if (MetodosAuxiliares.esMultiploDe(misNumeros[i], divisor) == false && MetodosAuxiliares.esPar(i + 1)) {
				suma += 1;
				numerosQueCumplen += misNumeros[i] + ", ";
			}
		}
		System.out.println("9.- Hay " + suma + " NO múltiplos de " + divisor + " \"en posición par\"\n\t entre "
				+ inicio + " y " + (fin + inicio));
		System.out.println("10.- \\ En nuestro ejemplo son " + numerosQueCumplen + "\\");

		// 11
		contador = 0;
		for (int i = 0; i < miVector.length; i++) {
			if (MetodosAuxiliares.esPar(miVector[i]) && miVector[i] > 25) {
				contador++;
				miVectorAux[i] = miVector[i];
			}
		}
		int[] miNuevoVector = new int[contador];
		int j = 0;
		for (int i = 0; i < miVectorAux.length; i++) {
			if (miVectorAux[i] != 0) {
				miNuevoVector[j] = miVectorAux[i];
				j++;
			}
		}
		System.out.print("11.- ");
		System.out.println("\tMi vector inicial era " + Arrays.toString(miVector));
		System.out.println("\tMi vector auxiliar es " + Arrays.toString(miVectorAux));
		System.out.println("\tMi nuevo vector será " + Arrays.toString(miNuevoVector));
		// 12
		contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
					|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A'
					|| frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O'
					|| frase.charAt(i) == 'U') {
				contador++;
			}
		}
		System.out.println("12.- Hay " + contador + " vocales.");
		// Otra forma de resolver el 12
		int contadorVocales = 0;
		String cadenaMayuscula = frase.toUpperCase();
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < frase.length(); i++) {
			char vocal = cadenaMayuscula.charAt(i);
			for (char c : vocales) {
				if (c == vocal) {
					contadorVocales++;
					break;
				}
			}

		}

		System.out.println("12.- Hay " + contadorVocales + " vocales");
	}
}

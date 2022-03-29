package basico;

import java.util.Arrays;

public class Exercise8_1 {

	public static void main(String[] args) {
		int tamano = 100;
//		double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		int[] array = new int[tamano];
//		System.out.println(Arrays.toString(powArray(array, 2)));
		System.out.println(Arrays.toString(histogram(array)));
	}

	public static double[] powArray(double[] a, int potencia) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], potencia);
		}
		return a;
	}

	public static int[] histogram(int[] b) {
		for (int i = 0; i < b.length; i++) {
			b[i] = i + 1;
		}
		return b;
	}
}

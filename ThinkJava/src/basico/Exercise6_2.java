package basico;

public class Exercise6_2 {

	public static void main(String[] args) {

		System.out.println(isDivisible(20, 4));
	}

	public static boolean isDivisible(int n, int m) {

		boolean isDivisible = false;

		if (n < m) {
			System.out.println("No se puede calcular");
		} else {
			if (n % m == 0) {
				isDivisible = true;
			} else {
				isDivisible = false;
			}
		}
		return isDivisible;
	}
}

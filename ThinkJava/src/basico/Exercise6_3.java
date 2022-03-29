package basico;

public class Exercise6_3 {

	public static void main(String[] args) {
		esTriangulo(12, 1, 1);
		System.out.println(esTriangulo(3, 1, 1));
	}

	public static boolean esTriangulo(int a, int b, int c) {
		boolean esPosible = false;

		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c) {
				esPosible = false;
			}
			if (a + c > b) {
				esPosible = false;
			}
			if (b + c > a) {
				esPosible = false;
			}
		} else {
			esPosible = true;
		}

		return esPosible;
	}

}

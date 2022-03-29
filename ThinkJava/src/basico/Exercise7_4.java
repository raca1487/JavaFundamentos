package basico;

public class Exercise7_4 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("El factorial de " + n + " es " + factorial(n));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int recurse = factorial(n - 1);
		int result = n * recurse;
		return result;
	}

}

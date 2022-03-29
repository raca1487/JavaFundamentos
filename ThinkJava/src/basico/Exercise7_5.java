package basico;

public class Exercise7_5 {

	public static void main(String[] args) {
		check(1);
	}

	public static double miexp(int x, int n) {
		double result = Math.pow(x, n) / Exercise7_4.factorial(n);
		return result;
	}

	public static void check(int x) {
		int n = 3;
		System.out.println(x + "\t" + miexp(x, n) + "\t" + Math.exp(x));
	}
}

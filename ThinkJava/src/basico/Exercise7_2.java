package basico;

public class Exercise7_2 {

	public static void main(String[] args) {

		squareRoot(9);
	}

	public static double squareRoot(double a) {
		double x0 = a / 2;
		double x1 = a / 2;
		double i = 0;

		do {
			x0 = x1;
			x1 = (x0 + x0 / 2) / 2;
			i = Math.abs(x1 - x0);
			System.out.println(i);

		} while (i > 0.001);
		return i;
	}

}

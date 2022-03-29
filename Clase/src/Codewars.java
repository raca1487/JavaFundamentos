

public class Codewars {

	public static void main(String[] args) {

		System.out.println("EJERCICIO DE CAMEL CASE");
		String string = "the-stealth-warrior";
		String strings = "the_stealth_warrior";

		System.out.println(toCamelCase(string));
		System.out.println(toCamelCase(strings));
		System.out.println("----------");
		System.out.println("EJERCICIO PIN CODE");
		String pin1 = "1234";
		String pin2 = "12345";
		String pin3 = "123456";
		System.out.println("\"" + pin1 + "\"   -->  " + validatePin(pin1));
		System.out.println("\"" + pin2 + "\"  -->  " + validatePin(pin2));
		System.out.println("\"" + pin3 + "\" -->  " + validatePin(pin3));
		System.out.println();
		System.out.println(digital_root(16));
		System.out.println(digital_root(785504));

	}

	static String toCamelCase(String str) {
		String texto = "";
		String[] partes = str.split("[-|_]");
		String firstWord = partes[0];
		for (int i = 1; i < partes.length; i++) {
			texto += toProperCase(partes[i]);
		}
		return firstWord + texto;
	}

	static String toProperCase(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static boolean validatePin(String pin) {
		return pin.matches("[\\d]{4}|[\\d]{6}");
	}

	public static int digital_root(int n) {
		int digit;
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		while (n > 0) {
			digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		
		while (sum >= 10) {
			digit = sum % 10;
			sum2 += digit;
			sum = sum / 10;
		}
		
		if (sum2 >= 10) {
			digit = sum2 % 10;
			sum3 += digit;
			sum2 = sum / 10;
		}

		return sum + sum2 + sum3;
	}
}

package basico;

public class Exercise7_1 {

	public static void main(String[] args) {

		System.out.println("i  | n");
		System.out.println("___|___");

		loop(10);
		
	}

	public static void loop(int n) {
		int i = n;
		while (i > 1) {
			System.out.println(n + " | " + i);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
	}
}

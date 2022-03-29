package basico;

public class Exercise4_3 {

	public static void main(String[] args) {
		printAmerican("Tuesday", 05, "October", 2021);
		System.out.println();
		printEuropean("Tuesday", 05, "October", 2021);
	}

	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American format: ");
		System.out.println(day + ", " + month + " " + date + "th, " + year);
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European format: ");
		System.out.println(day + ", " + date + " " + month + " " + year);
	}
}

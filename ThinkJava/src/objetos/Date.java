package objetos;

public class Date {

	public static void main(String[] args) {
		Date birthday = new Date();
		System.out.println(birthday);
	}

	private int year;
	private int month;
	private int day;

	public Date() {
//		this(1987, 10, 24);
		year= 1987;
		month = 10;
		day = 24;
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Tu cumpleaños es el día " + day + " del mes " + month + " del año " + year + ".";
	}
	
}

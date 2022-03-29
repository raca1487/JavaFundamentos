import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Password {
	private int longitud;
	private String contrasegna;
	static String mayusculas = "QWERTYUIOPASDFGHJKLZXCVBNM";
	static String minusculas = "qwertyuiopasdfghjklzxcvbnm";
	static String numeros = "0123456789";

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasegna() {
		return contrasegna;
	}

	public Password() {
		this.longitud = 8;
		this.contrasegna = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
	}

//	public boolean esFuerte() {
//		
//	}

	public static char[] generarPassword(int longitud) {
		char[] password = new char[longitud];
		for (int i = 0; i < password.length; i++) {
			int numAleatorio = ThreadLocalRandom.current().nextInt(0, (mayusculas + minusculas + numeros).length() + 1);
			char character = (mayusculas + minusculas + numeros).charAt(numAleatorio);
			password[i] = character;
		}
		return password;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca longitud de la password");
		int longitudPass = entrada.nextInt();
		
		System.out.println(generarPassword(longitudPass));
	}

}

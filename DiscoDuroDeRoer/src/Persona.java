import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {

	private final static char SEXO_DEFECTO = 'H';
	private final static int INFRAPESO = -1;
	private final static int PESO_IDEAL = 0;
	private final static int SOBREPESO = 1;

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_DEFECTO;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		generaDni();
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// Metodos
	public int calcularIMC() {
		double pesoActual = peso / Math.pow(altura, 2);
		int valor;

		if (pesoActual < 20) {
			valor = INFRAPESO;
		} else if (pesoActual < 25) {
			valor = PESO_IDEAL;
		} else {
			valor = SOBREPESO;
		}
		return valor;
	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	private void comprobarSexo(char sexo) {
		if (sexo != 'H' || sexo != 'M') {
			this.sexo = SEXO_DEFECTO;
		}
	}

	private void generaDni() {
		final int DIVISOR = 26;
		int numeroDni = ThreadLocalRandom.current().nextInt(00000000, 100000000);
		int i = numeroDni % DIVISOR;
		char letraDni = generaletraDni(i);

		dni = Integer.toString(numeroDni) + "-" + letraDni;

	}

	private char generaletraDni(int i) {
		char[] letras = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
				'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
		return letras[i];
	}

	@Override
	public String toString() {
		return "Persona\n\tNombre:\t" + getNombre() + "\n\tEdad:\t" + getEdad() + "\n\tDNI:\t" + dni + "\n\tSexo:\t"
				+ getSexo() + "\n\tPeso:\t" + getPeso() + " Kgs" + "\n\tAltura:\t" + getAltura() + " mts";
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca su nombre:");
		String nombre = entrada.nextLine();
		System.out.println("Introduzca su edad:");
		int edad = entrada.nextInt();
		System.out.println("Introduzca su sexo:");
		char sexo = entrada.next().charAt(0);
		System.out.println("Introduzca su peso (en kgs):");
		double peso = entrada.nextDouble();
		System.out.println("Introduzca su altura (en mts):");
		double altura = entrada.nextDouble();

		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
//		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();

		persona3.setNombre("Rosa");
		persona3.setEdad(41);
		persona3.setSexo('M');
		persona3.generaDni();
		persona3.setPeso(58.5);
		persona3.setAltura(1.60);
//		System.out.println(persona1);
		System.out.println(persona3);
//		System.out.println(persona1.esMayorDeEdad(persona1.edad));
	}

}

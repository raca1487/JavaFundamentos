package objetos;

public class Rational {

	private int numerador;
	private int denominador;
	
	public static void main(String[] args) {
		Rational numRacional = new Rational();
		numRacional.setNumerador(14);
		numRacional.setDenominador(2);
		System.out.println(numRacional);
		
	}
	
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public Rational() {
		setNumerador(0);;
		setDenominador(1);;
	}
	
	public Rational(int numerador, int denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
	}
	
	public int printRational(int numerador, int denominador) {
		return numerador / denominador;
	}
	
	public void negate() {
		this.numerador = - this.numerador;
	}
	
//	public static double invert() {
//		return 1 / printRational(numerador, denominador);
//	}

	@Override
	public String toString() {
		return "El número Rational de " + getNumerador() + " y " + getDenominador() + " es "
				+ printRational(getNumerador(), getDenominador());
	}
}

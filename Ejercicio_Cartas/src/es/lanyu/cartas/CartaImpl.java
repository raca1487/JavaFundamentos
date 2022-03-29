package es.lanyu.cartas;

import java.util.Objects;

public class CartaImpl implements Carta<Integer> {

	private int palo;
	private int numeroCarta;
	static String[] palos = { "OROS", "COPAS", "ESPADAS", "BASTOS" };

	@Override
	public Integer getPalo() {
		return palo;
	}

	@Override
	public int getNumeroCarta() {
		return numeroCarta;
	}

	public static String[] getPalos() {
		return palos;
	}

	public CartaImpl(int palo, int numeroCarta) {
		this.palo = palo;
		this.numeroCarta = numeroCarta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCarta, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartaImpl other = (CartaImpl) obj;
		return numeroCarta == other.numeroCarta && palo == other.palo;
	}

	@Override
	public String getPaloString() {
		return getPalos()[getPalo()];
	}

	@Override
	public String getNumeroString() {
		String numeroCarta = getNumeroCarta() + "";
		if (getNumeroCarta() == 1) {
			numeroCarta = "As";
		} else if (getNumeroCarta() == 8) {
			numeroCarta = "Sota";
		} else if (getNumeroCarta() == 9) {
			numeroCarta = "Caballo";
		} else if (getNumeroCarta() == 10) {
			numeroCarta = "Rey";
		}

		return numeroCarta;
	}

	@Override
	public String toString() {
		return getNumeroString() + " de " + getPaloString();
	}

}

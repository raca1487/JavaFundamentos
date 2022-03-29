package es.lanyu.cartas;

public class CartaFamilias extends CartaImpl {

	static {
		CartaImpl.palos = new String[] { "Esquimales", "Europeos" };
	}
	
	public static String[] getPalos() {
		return palos;
	}
	
	public CartaFamilias(int palo, int numeroCarta) {
		super(palo, numeroCarta);
	}
	
	@Override
	public String getNumeroString() {
		String numeroCarta = getNumeroCarta() + "";
		if (getNumeroCarta() == 1) {
			numeroCarta = "Madre";
		} else if (getNumeroCarta() == 2) {
			numeroCarta = "Padre";
		} else if (getNumeroCarta() == 3) {
			numeroCarta = "Hijo";
		} else if (getNumeroCarta() == 4) {
			numeroCarta = "Hija";
		}

		return numeroCarta;
	}

}

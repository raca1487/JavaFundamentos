package es.lanyu.cartas;

public interface Carta<T extends Comparable<T>> extends Comparable<Carta<T>> {

	T getPalo();
	int getNumeroCarta();
	String getPaloString();
	String getNumeroString();

	default int compareTo(Carta<T> carta) {
		int resultado = getPalo().compareTo(carta.getPalo());
		if (resultado == 0) {
			resultado = Integer.compare(getNumeroCarta(), carta.getNumeroCarta());
		}
		return resultado;
	};

}
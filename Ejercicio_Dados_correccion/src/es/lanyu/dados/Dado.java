package es.lanyu.dados;

public interface Dado extends Comparable<Dado> {

	int getNumeroCaras();
	int getCaraVista();
	int lanzar();

	default int compareTo(Dado dado) {
		return Integer.compare(dado.getCaraVista(), getCaraVista());
	};

}
package es.lanyu.dados;

public interface Dado<T extends Comparable<T>> extends Comparable<Dado<T>> {

	T[] getCarasDado();

	T getCaraVista();

	void lanzar();

	default int compareTo(Dado<T> dado) {
		return dado.getCaraVista().compareTo(getCaraVista());
	};

}
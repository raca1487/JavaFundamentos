package es.lanyu.dados;

public class Tirada {

	private int numeroLanzamientos;
	private int numeroCarasNumericas;

	public int getNumeroLanzamientos() {
		return numeroLanzamientos;
	}

	public int getNumeroCarasNumericas() {
		return numeroCarasNumericas;
	}

	public int[] hacerTirada(String ndm) {
		int n = ndm.charAt(0);
		int m = ndm.charAt(2);
		n = getNumeroLanzamientos();
		m = getNumeroCarasNumericas();
		Dado dado = new DadoImpl(m);
		return hacerTirada(dado, n);
	}

	public int[] hacerTirada(Dado dado, int numeroLanzamientos) {
		int[] carasVistas = new int[numeroLanzamientos];
		for (int i = 0; i < carasVistas.length; i++) {
			carasVistas[i] = dado.lanzar();
		}

		return carasVistas;
	}

}

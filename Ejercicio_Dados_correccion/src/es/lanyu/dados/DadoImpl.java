package es.lanyu.dados;

import java.util.concurrent.ThreadLocalRandom;

public class DadoImpl implements Dado {

	private int minimaCara = 1;
	private int numeroCaras;
	private int caraVista;

	public int getMinimaCara() {
		return minimaCara;
	}

	@Override
	public int getNumeroCaras() {
		return numeroCaras;
	}

	@Override
	public int getCaraVista() {
		return caraVista;
	}

	public DadoImpl() {
		this(6);
	}

	public DadoImpl(int numeroCaras) {
		this.numeroCaras = numeroCaras;
	}

	@Override
	public int lanzar() {
		caraVista = ThreadLocalRandom.current().nextInt(getMinimaCara(), getNumeroCaras() + 1);
		return caraVista;
	}
	
	@Override
	public String toString() {
		return getCaraVista() + " vista (" + getMinimaCara() + " - " + getNumeroCaras() + ")";
	}

}

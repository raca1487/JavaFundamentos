package es.lanyu.dados;

import java.util.concurrent.ThreadLocalRandom;

public class DadoNumerico implements Dado<Integer> {

	private Integer[] carasDado;
	private int caraVista;
	private int numeroCaras;
	
	@Override
	public Integer[] getCarasDado() {
		return carasDado;
	}
	
	@Override
	public Integer getCaraVista() {
		return caraVista;
	}
	
	public int getNumeroCaras() {
		return numeroCaras;
	}
	
	public DadoNumerico(int numeroCaras) {
		carasDado = new Integer[numeroCaras];
		for (int i = 0; i < numeroCaras; i++) {
			getCarasDado()[i] = i + 1;
		}
	}
	
	public DadoNumerico() {
		this(6);
	}
	
	@Override
	public void lanzar() {
		caraVista = ThreadLocalRandom.current().nextInt(getCarasDado()[0], getCarasDado().length + 1);
	}
	
	@Override
	public String toString() {
		return getCaraVista() + " (" + getCarasDado()[0] + " - " + getCarasDado().length + ")";
	}
	
}

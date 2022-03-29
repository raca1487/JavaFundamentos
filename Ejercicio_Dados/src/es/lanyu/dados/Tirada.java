package es.lanyu.dados;

import java.util.Arrays;

import com.github.dice.PokerFace;

public class Tirada {
	
	private int[] lanzamientos;
	private int sumaTotalValores;
	
	public int[] getLanzamientos() {
		return lanzamientos;
	}
	
	public int getSumaTotalValores() {
		return sumaTotalValores;
	}
	
	public void setSumaTotalValores(int sumaTotalValores) {
		this.sumaTotalValores = sumaTotalValores;
	}
	
	public int[] hacerTirada(String ndm) {
		String[] partes = ndm.split("d");
		int numeroLanzamientos = Integer.parseInt(partes[0]);
		int carasDado = Integer.parseInt(partes[1]);
		
		Dado<Integer> dado = new DadoNumerico(carasDado);
		lanzamientos = new int[numeroLanzamientos];
		int sumaValores = 0;
		for (int i = 0; i < getLanzamientos().length; i++) {
			dado.lanzar();
			getLanzamientos()[i] = dado.getCaraVista();
			sumaValores += getLanzamientos()[i];
		}
		setSumaTotalValores(sumaValores);
		
		return getLanzamientos();
	}

	public int[] hacerTirada(Dado<PokerFace> dado, int numeroLanzamientos) {
		lanzamientos = new int[numeroLanzamientos];
		int sumaValores = 0;
		for (int i = 0; i < getLanzamientos().length; i++) {
			dado.lanzar();
			getLanzamientos()[i] = dado.getCaraVista().getRank();
			sumaValores += getLanzamientos()[i];
		}
		setSumaTotalValores(sumaValores);
		
		return getLanzamientos();
	}
	
	@Override
	public String toString() {
		return Arrays.toString(getLanzamientos()) + ": " + getSumaTotalValores();
	}
	
}

package com.dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import es.lanyu.dados.*;

public class Partida {

	public static void main(String[] args) {

		DadoImpl dado1 = new DadoImpl();
		System.out.println("Lanzo dado: ");
		System.out.println(dado1.lanzar());
		System.out.println(dado1);

		Tirada tirada = new Tirada();
		System.out.println("Hago una tirada segun numero de lanzamientos y caras del dado: ");
		System.out.println(Arrays.toString(tirada.hacerTirada("2d8")));
		System.out.println("Hago una tirada segun numero de lanzamientos: ");
		System.out.println(Arrays.toString(tirada.hacerTirada(dado1, 2)));

		Collection<Dado> dados = new ArrayList<>();
		DadoImpl dado2 = new DadoImpl();
		DadoImpl dado3 = new DadoImpl();

		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);

		dado1.lanzar();
		dado2.lanzar();
		dado3.lanzar();

		List<Dado> listaDados = (List<Dado>)dados;
		listaDados.sort(null);
		System.out.println("Comprobando el orden natural en los lanzamientos de los dados: ");
		System.out.println(listaDados);
		
		Comparator<Tirada> comparador = new Comparator<Tirada>() {

			@Override
			public int compare(Tirada t1, Tirada t2) {
				return Integer.compare(sumaValoresTirada(t2, 2), sumaValoresTirada(t1, 2));
			}
		};
		
		Collection<Tirada> otrosDados = new ArrayList<>();
		Tirada tirada1 = new Tirada();
		Tirada tirada2 = new Tirada();
		Tirada tirada3 = new Tirada();
		tirada1.hacerTirada("2d8");
		tirada2.hacerTirada("2d8");
		tirada3.hacerTirada("2d8");
		
		List<Tirada> listaTiradas = (List<Tirada>)otrosDados;
		listaTiradas.add(tirada1);
		listaTiradas.add(tirada2);
		listaTiradas.add(tirada3);
		
		System.out.println("Comprobando el orden de mayor a menor respecto a la suma total de tiradas: ");
		listaTiradas.sort(comparador);
		
	}
	
	private static int sumaValoresTirada(Tirada tirada, int numeroLanzamientos) {
		int suma = 0;
		int[] tiradas = tirada.hacerTirada(new DadoImpl(), numeroLanzamientos);
		for (int i = 0; i < tiradas.length; i++) {
			suma += tiradas[i];
		}
		
		return suma;
	}

}

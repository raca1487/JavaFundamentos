package com.dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import es.lanyu.dados.Dado;
import es.lanyu.dados.DadoNumerico;
import es.lanyu.dados.DadoPoker;
import es.lanyu.dados.Tirada;

public class Partida {

	public static void main(String[] args) {
		
		System.out.println("INICIO EJERCICIO");
		System.out.println("----------");
		System.out.println("----------");
		Dado dado1 = new DadoNumerico();
		dado1.lanzar();
		System.out.println(dado1);
		System.out.println("----------");
		
		Tirada tirada1 = new Tirada();
		tirada1.hacerTirada("3d8");
		System.out.println(">> Realizando una tirada pasándole un String:");
		System.out.println(tirada1);
		System.out.println("----------");
		
		Tirada tirada2 = new Tirada();
//		tirada2.hacerTirada(dado1, 2);
//		System.out.println(">> Realizando una tirada pasándole un Dado y un número de lanzamientos:");
//		System.out.println(tirada2);
//		System.out.println("----------");

		System.out.println("COMPROBANDO CLASE EXTERNA PARA DADOS DE POKER");
		Dado dadoPoker = new DadoPoker();
		Tirada tiradaExterna = new Tirada();
		tiradaExterna.hacerTirada(dadoPoker, 3);
		System.out.println(">> Realizando una tirada de POKER pasándole un Dado y un número de lanzamientos:");
		System.out.println(tiradaExterna);
		System.out.println("----------");
		dadoPoker.lanzar();
		System.out.println("Lanzando un dado de POKER:");
		System.out.println(dadoPoker);
		System.out.println("----------");
		
		Collection<Dado> dados = new ArrayList<Dado>();
		Dado dado2 = new DadoNumerico();
		Dado dado3 = new DadoNumerico();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dado1.lanzar();
		dado2.lanzar();
		dado3.lanzar();
		List<Dado> listaDados = new ArrayList<Dado>(dados);
		System.out.println(listaDados);
		listaDados.sort(null);
		System.out.println("Ordenando la lista de dados lanzados (orden natural):");
		System.out.println(listaDados);
		System.out.println("----------");
		
		Comparator<Tirada> comparador = new Comparator<Tirada>() {

			@Override
			public int compare(Tirada tirada1, Tirada tirada2) {
				int resultado = Integer.compare(tirada2.getSumaTotalValores(), tirada1.getSumaTotalValores());
				if (resultado == 0) {
					resultado = Integer.compare(valorUltimoLanzamiento(tirada2), valorUltimoLanzamiento(tirada1));
				}
				return resultado;
			}
		};
		
		List<Tirada> listaTiradas = new ArrayList<Tirada>();
		Tirada tirada3 = new Tirada();
		listaTiradas.add(tirada1);
		listaTiradas.add(tirada2);
		listaTiradas.add(tirada3);
		tirada1.hacerTirada("2d8");
		tirada2.hacerTirada("2d8");
		tirada3.hacerTirada("2d8");
		System.out.println(listaTiradas);
		listaTiradas.sort(comparador);
		System.out.println("Ordenando la lista de tiradas lanzadas (según comparador):");
		System.out.println(listaTiradas);
		System.out.println("----------");
		
		System.out.println("Comprobados todos los métodos con genéricos");
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("FIN EJERCICIO");
		
	}
	
	private static int valorUltimoLanzamiento(Tirada tirada) {
		int[] numeroLanzamientos = tirada.getLanzamientos();
		int ultimoValor = numeroLanzamientos[numeroLanzamientos.length - 1];
		
		return ultimoValor;
	}

}

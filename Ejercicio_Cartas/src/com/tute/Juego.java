package com.tute;

import java.util.Comparator;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.CartaExterna;
import es.lanyu.cartas.CartaFamilias;
import es.lanyu.cartas.CartaImpl;
import es.lanyu.cartas.Mano;

public class Juego {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		String[] palos = CartaFamilias.getPalos();
		int maximo = 4;
		
		for (int i = 0; i < palos.length; i++) {
			for (int j = 1; j <= maximo; j++) {
				baraja.getCartas().add(new CartaFamilias(i, j));
			}
		}
		
		baraja.getCartas().forEach(System.out::println);
		System.out.println("----------");
		baraja.barajar();
		baraja.getCartas().forEach(System.out::println);
		System.out.println("----------");
		Carta buscada = new CartaFamilias(palos.length - 1, maximo);
		System.out.println(">> Robo la carta: " + baraja.robar(buscada));
		baraja.getCartas().forEach(System.out::println);
		System.out.println("----------");
		System.out.println(">> Busco la carta: " + buscada);
		System.out.println("La carta se encuentra en la baraja: " + baraja.encuentraCarta(buscada));
		System.out.println("----------");
		baraja.barajar();
		baraja.getCartas().forEach(System.out::println);
		System.out.println("----------");
		baraja.getCartas().sort(null);
		baraja.getCartas().forEach(System.out::println);
		System.out.println("----------");
	
	}

}

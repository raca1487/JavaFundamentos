package com.acing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrito {

	private List<Suministrable> productos = new ArrayList<Suministrable>();

	public List<Suministrable> getProductos() {
		return productos;
	}

	public boolean addProducto(Suministrable producto) {
		return getProductos().add(producto);
	}

	public float getValorCarrito() {
		float valorTotal = 0;
		for (Suministrable producto : getProductos()) {
			valorTotal += producto.getPrecio();
		}
		
		return valorTotal;
	}

	public String getInformeCarrito() {
		String informe = "";
		Comparator<Suministrable> comparador = new Comparator<Suministrable>() {

			@Override
			public int compare(Suministrable p1, Suministrable p2) {
				return Double.compare(p1.getPrecio(), p2.getPrecio());
			}
		};
		getProductos().sort(comparador);
		for (Suministrable producto : getProductos()) {
			informe += producto.toString() + " " + producto.getPrecio() + " €" + System.lineSeparator();
		}
		informe += String.format("\tEl valor total del carrito es: %1.2f ", getValorCarrito()) + "€";

		return informe;
	}
}

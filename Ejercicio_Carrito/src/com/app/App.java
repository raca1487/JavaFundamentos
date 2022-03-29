package com.app;

import java.util.ArrayList;
import java.util.Collection;

import com.acing.Carrito;
import com.acing.Identificable;
import com.acing.Marca;
import com.acing.Producto;
import com.acing.ProductoExterno;
import com.acing.Suministrable;

public class App {

	private Carrito carrito;
	private static final Collection<Producto> PRODUCTOS = new ArrayList<>();
	int[] almacen;

	public Carrito getCarrito() {
		return carrito;
	}

	public static Collection<Producto> getProductos() {
		return PRODUCTOS;
	}

	public int[] getAlmacen() {
		return almacen;
	}
	
	public void setAlmacen(int id) {
		almacen = new int[id + 1];
	}

	public App() {
		carrito = new Carrito();
	}

	public static void main(String[] args) {

		Producto refresco = new Producto(1, "12 latas Refresco", 6.01, new Marca("Coca Cola"));
		Producto leche = new Producto(2, "Leche Semidesnatada 1 litro", .72, new Marca("President"));
		Producto pastaDientes = new Producto(5, "Dentifrico", 1.99, new Marca("Oral B"));
		Producto agua = new Producto(8, "6 botellas 1,5 litro", 2.99, new Marca("Font Vella"));

		App miApp = new App();
		miApp.getCarrito().addProducto(refresco);
		miApp.getCarrito().addProducto(leche);
		miApp.getCarrito().addProducto(pastaDientes);

		Suministrable libro = new ProductoExterno("Crime & Punishment", 0.46);
		miApp.getCarrito().addProducto(libro);

		System.out.println(miApp.getCarrito().getInformeCarrito());
		
		getProductos().add(refresco);
		getProductos().add(leche);
		getProductos().add(pastaDientes);
		getProductos().add(agua);
		
		int maximoId = getMaximoId(PRODUCTOS);
		System.out.println("El id maximo es " + maximoId);
		
		miApp.setAlmacen(maximoId);
		
		miApp.getAlmacen()[1] = 8;
		miApp.getAlmacen()[2] = 3;
		miApp.getAlmacen()[5] = 0;
		miApp.getAlmacen()[8] = 1;
		
		miApp.addToCarrito(pastaDientes);
		System.out.println(miApp.getCarrito().getInformeCarrito());
		miApp.addToCarrito(agua);
		System.out.println(miApp.getCarrito().getInformeCarrito());

	}

	private static <T extends Identificable> int getMaximoId(Collection<T> productos) {
		int maximoId = 0;
		for (Identificable producto : productos) {
			if (producto.getId() > maximoId) {
				maximoId = producto.getId();
			}
		}
		
		return maximoId;
	}
	
	public <T extends Identificable & Suministrable > boolean addToCarrito(T producto) {
		boolean agregado = false;
		if (cantidadEnAlmacen(producto) > 0) {
			agregado = getCarrito().addProducto(producto);
			if (agregado) {
				getAlmacen()[producto.getId()]--;
				System.out.println("Quedan " + cantidadEnAlmacen(producto) + " de " + producto);
			} else {
				System.out.println("Ocurrió un error al añadir " + producto);
			}
		} else {
			System.out.println("No hay existencias de " + producto);
		}
		
		return agregado;
	}
	
	public int cantidadEnAlmacen(Identificable producto) {
		int id = producto.getId();
		int cantidad = getAlmacen()[id];
		
		return cantidad;
	}

}

package com.acing;

public class Producto implements Suministrable, Identificable {

	private int id;
	private String descripcion;
	private double precio;
	private Marca marca;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public Producto(int id, String descripcion, double precio, Marca marca) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public Producto(String descripcion, double precio, Marca marca) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public Producto() {
		this(-1, "Sin descripcion", 0, null);
	}
	
	@Override
	public String toString() {
		return getDescripcion() + " - " + getMarca();
	}
}

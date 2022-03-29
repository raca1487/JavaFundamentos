package com.acing;

public class Marca {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public Marca(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return getNombre();
	}
}

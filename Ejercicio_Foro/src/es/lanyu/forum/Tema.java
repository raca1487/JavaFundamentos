package es.lanyu.forum;

public class Tema {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public Tema(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Tema: " + getNombre();
	}

}

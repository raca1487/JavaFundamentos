package es.lanyu.forum;

public class UsuarioImpl implements Usuario {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public UsuarioImpl(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return getNombre().toUpperCase();
	}
	
}

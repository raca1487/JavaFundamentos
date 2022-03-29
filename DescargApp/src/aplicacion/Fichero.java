package aplicacion;

public class Fichero {
	
	private float tamano;
	private Contenido contenido;
	
	public float getTamano() {
		return tamano;
	}
	
	public Contenido getContenido() {
		return contenido;
	}
	
	public Fichero(float tamano, Contenido contenido) {
		super();
		this.tamano = tamano;
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		return getContenido() + " [" + getTamano() + " MB]";
	}
	
}

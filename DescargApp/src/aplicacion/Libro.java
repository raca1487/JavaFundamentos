package aplicacion;

import software_libre.Book;

public class Libro extends Book implements Contenido {

	@Override
	public String getId() {
		return getIsbn();
	}
	
	@Override
	public String getNombre() {
		return getTitle();
	}

	public Libro(String id, String titulo) {
		super(titulo, id);
	}
	
	@Override
	public String toString() {
		return toText();
	}
	
}

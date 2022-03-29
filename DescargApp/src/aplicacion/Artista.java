package aplicacion;

import java.util.Collection;

public class Artista extends Persona {

	Collection<Artista> grupoMusical;
	
	public Artista(String nombre, int agno, int month, int day, String paisNacimiento) {
		super(nombre, agno, month, day, paisNacimiento);
	}
	
	@Override
	public String toString() {
		return "Artista:" + super.toString();
	}
	
}

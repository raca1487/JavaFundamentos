package aplicacion;

public class Pelicula extends ContenidoImpl {
	
	private Persona director;
	private Persona actoresPrincipales;

	public Pelicula(String id, String titulo) {
		super(id, titulo);
	}
	
}

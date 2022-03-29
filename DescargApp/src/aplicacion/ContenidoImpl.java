package aplicacion;

public class ContenidoImpl implements Contenido {
	
	private String id;
	private String nombre;
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public ContenidoImpl(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return toText();
	}

}

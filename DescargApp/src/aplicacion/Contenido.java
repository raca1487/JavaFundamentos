package aplicacion;

public interface Contenido extends Identificable, Nombrable {

	default String getTitulo() {
		return getNombre();
	};

	default String toText() {
		return getClass().getSimpleName() + ": (" + getId() + ") " + getNombre();
	}
	
}

package aplicacion;

public interface Nombrable {

	default String getNombre() {
		return "No disponible";
	};

}

package es.heladeria.helado;

public class IngredienteImpl implements Ingrediente {

	private float precio;
	private String descripcion;

	public IngredienteImpl(String descripcion, float precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public float getPrecio() {
		return precio;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return getDescripcion();
	}

}

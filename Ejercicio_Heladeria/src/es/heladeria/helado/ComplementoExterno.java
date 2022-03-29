package es.heladeria.helado;

import com.github.extras.Extra;

public class ComplementoExterno extends Extra implements Ingrediente {

	public ComplementoExterno(String description, float price) {
		super(description, price);
	}

	@Override
	public float getPrecio() {
		return getPrice();
	}

	@Override
	public String getDescripcion() {
		return getDescription();
	}

	@Override
	public String toString() {
		return getDescripcion();
	}

}

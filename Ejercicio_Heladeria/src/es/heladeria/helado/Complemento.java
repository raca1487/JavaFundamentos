package es.heladeria.helado;

import java.util.ArrayList;
import java.util.List;

import com.github.extras.Extra;

public class Complemento implements Ingrediente {

	private float precio;
	private String descripcion;
	public static final List<Ingrediente> COMPLEMENTOS = new ArrayList<>();

	static {
		COMPLEMENTOS.add(new Complemento("Virutas de chocolate", .5f));
		COMPLEMENTOS.add(new Complemento("Galletitas", .8f));
		
		for (Extra complemento : ComplementoExterno.EXTRAS) {
			COMPLEMENTOS.add(new ComplementoExterno(complemento.getDescription(), complemento.getPrice()));
		}
		
	}

	public Complemento(String descripcion, float precio) {
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

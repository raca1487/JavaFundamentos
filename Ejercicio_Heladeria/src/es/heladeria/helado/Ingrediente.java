package es.heladeria.helado;

public interface Ingrediente extends Descriptible, Priceable {

	default boolean sirveComoBase() {
		return false;
	}
	
}

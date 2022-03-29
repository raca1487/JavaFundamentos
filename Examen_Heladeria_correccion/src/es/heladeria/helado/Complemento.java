package es.heladeria.helado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.github.extras.Extra;

public class Complemento extends IngredienteImpl {
	public static final List<Ingrediente> EXTRAS;// = Arrays.asList(
//      new Complemento("Virutas de chocolate", .5f),
//      new Complemento("Galletitas", .8f),
//      new ComplementoExterno("Lemon", .2f),
//      new ComplementoExterno("Caramel", .3f),
//      new ComplementoExterno("Mango", .4f),
//      new ComplementoExterno("Chocolate", .5f),
//      new ComplementoExterno("Raspberry", .6f),
//      new ComplementoExterno("Strawberry", .7f)
//  );

	// Es mas correcto instanciar dinamicamente que "hardcodear" valores
	static {
		EXTRAS = new ArrayList<>();
		Collections.addAll(EXTRAS, new Complemento("Virutas de chocolate", .5f), new Complemento("Galletitas", .8f));
		
    Stream.of(Extra.EXTRAS)
      .map(e -> new ComplementoExterno(e.getDescription(), e.getPrice()))
      .forEach(EXTRAS::add);
		
		// Se puede hacer con un bucle normal o con streams
//		for (Extra ingrediente : ComplementoExterno.EXTRAS) {
//			EXTRAS.add(new ComplementoExterno(ingrediente.getDescription(), ingrediente.getPrice()));
//		}
	}

	public Complemento(String descripcion, float precio) {
		super(descripcion, precio);
	}

}

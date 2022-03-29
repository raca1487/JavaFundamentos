package es.heladeria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import es.heladeria.helado.Complemento;
import es.heladeria.helado.CopaHelado;
import es.heladeria.helado.Descriptible;
import es.heladeria.helado.Ingrediente;
import es.heladeria.helado.IngredienteBase;
import es.heladeria.helado.Priceable;

public class App {

	private static final List<Ingrediente> COMPLEMENTOS = new ArrayList<>(Complemento.COMPLEMENTOS);
	
	public static void main(String[] args) {
		
		CopaHelado helado1 = new CopaHelado();
		Ingrediente virutas = COMPLEMENTOS.get(0);
		Ingrediente galletitas = COMPLEMENTOS.get(1);
		
		Ingrediente lemon = COMPLEMENTOS.get(2);
		Ingrediente caramel = COMPLEMENTOS.get(3);
		
		agregarComplemento(virutas, helado1);
//		agregarComplemento(virutas, helado1);
		agregarComplemento(galletitas, helado1);
//		agregarComplemento(galletitas, helado1);
		agregarComplemento(lemon, helado1);
		agregarComplemento(caramel, helado1);
		
		System.out.println(helado1);
		
		System.out.println("------------------");
		
		CopaHelado helado2 = new CopaHelado(new IngredienteBase("Nata"));
		helado2.addComplemento(new IngredienteBase("Chocolate"));
		agregarComplemento(caramel, helado2);
		
		System.out.println(helado2);
		
		System.out.println("------------------");

		List<CopaHelado> helados = new ArrayList<CopaHelado>();
		helados.add(helado1);
		helados.add(helado2);
		helados.forEach(System.out::println);
		System.out.println();
		System.out.println("Orden natural");
		helados.sort(null);
		helados.forEach(System.out::println);
		
		Comparator<CopaHelado> comparador = new Comparator<CopaHelado>() {

			@Override
			public int compare(CopaHelado copa1, CopaHelado copa2) {
				int resultado = Integer.compare(copa2.getNumeroComplementos(), copa1.getNumeroComplementos());
				if (resultado == 0) {
					resultado = copa2.compareTo(copa1);
				}
				
				return resultado;
			}
		};

		System.out.println("Orden con comparador");
		helados.sort(comparador);
		helados.forEach(System.out::println);
		
		System.out.println("------------------");
		imprimirCuenta(helados);
	}
	
	private static void agregarComplemento(Ingrediente complemento, CopaHelado helado) {
//		if (helado.addComplemento(complemento)) {
//			System.out.println("Añadido " + complemento);
//		} else {
//			System.out.println("NO añadido " + complemento);
//		}
		System.out.println((helado.addComplemento(complemento) ? "Añadido " : "NO añadido ") + complemento);
	}
	
	private static <T extends Descriptible & Priceable> void imprimirCuenta(Collection<T> productos) {
		System.out.println("--- Resumen de cuenta ---");
		for (T producto : productos) {
			System.out.println(producto + ": " + numeroDecimales(producto.getPrecio()) + "€");
		}
		System.out.println("Total " + productos.size() + " productos: " + numeroDecimales(precioCuenta(productos)) + "€");
	}
	
	private static <T extends Priceable> float precioCuenta(Collection<T> productos) {
		float cuenta = 0;
		for (T producto : productos) {
			cuenta += producto.getPrecio();
		}
		
		return cuenta;
	}
	
	private static String numeroDecimales(float decimal) {
		return String.format("%.2f", decimal);
		
	}

}

package es.heladeria;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.heladeria.helado.Complemento;
import es.heladeria.helado.ConDescripcion;
import es.heladeria.helado.CopaHelado;
import es.heladeria.helado.Ingrediente;
import es.heladeria.helado.IngredienteBase;
import es.heladeria.helado.ConPrecio;

public class App {

  private static final NumberFormat FORMATO_DECIMAL = new DecimalFormat("0.00");

  public static void main(String[] args) {
    CopaHelado helado = new CopaHelado();
    Ingrediente virutas = Complemento.EXTRAS.get(0);
    anadirComplementoEnHelado(virutas, helado);
    anadirComplementoEnHelado(Complemento.EXTRAS.get(1), helado);
    anadirComplementoEnHelado(Complemento.EXTRAS.get(2), helado);
    Ingrediente caramel = Complemento.EXTRAS.get(3);
    anadirComplementoEnHelado(caramel, helado);
    
    CopaHelado helado2;
    // Esto debe fallar y asignar "Vainilla"
//    helado2 = new CopaHelado(new IngredienteBase("Nata") { public boolean sirveComoBase() { return false ;} });
    
    // Mas caro con menos ingredientes
    helado2 = new CopaHelado(new IngredienteBase("Nata"));
    helado2.addComplemento(new IngredienteBase("Chocolate"), caramel);
    
    List<CopaHelado> helados = new ArrayList<>();
    Collections.addAll(helados, helado2, helado);
    helados.sort(null);
    
    System.out.println();
    System.out.println("Orden natural:");
    helados.forEach(System.out::println);
    
    Comparator<CopaHelado> comparador = new Comparator<CopaHelado>() {

      @Override
      public int compare(CopaHelado copa1, CopaHelado copa2) {
        int comparacion = -Integer.compare(copa1.numeroDeComplementos(), copa2.numeroDeComplementos());
        if (comparacion == 0) {
          comparacion = copa1.compareTo(copa2);
        }
        
        return comparacion;
      }
      
    };
    helados.sort(comparador);
    
    System.out.println();
    System.out.println("Orden con comparador:");
    helados.forEach(System.out::println);
    
    System.out.println();
    imprimirCuenta(Arrays.asList(helado, caramel));
  }
  
  private static void anadirComplementoEnHelado(Ingrediente ingrediente, CopaHelado helado) {
    System.out.println((helado.addComplemento(ingrediente) ? "Añadido " : "NO añadido ") + ingrediente);
  }
  
  private static String stringDeFloatEnCentimos(float decimal) {
//     Forma basica de hacerlo calculado por uno mismo
//    String string = Math.round(decimal * 100) / 100f + "0";
//    return string.substring(0, string.indexOf(".") + 3).replace(".", ",");
    
    // Otras dos formas mejores de hacerlo
    return FORMATO_DECIMAL.format(decimal);
//    return String.format("%.2f", decimal);
  }
  
  private static <T extends ConDescripcion & ConPrecio> void imprimirCuenta(Collection<? extends T> productos) {
    System.out.println("--- Resumen de cuenta ---");
    for (T producto : productos) {
      System.out.println(producto.getDescripcion() + ": " + stringDeFloatEnCentimos(producto.getPrecio()) + "€");
    }
    System.out.println("Total " + productos.size() + " productos: " + stringDeFloatEnCentimos(calcularPrecio(productos)) + "€");
  }

  private static <T extends ConPrecio> float calcularPrecio(Collection<? extends T> valorables) {
    return (float) valorables.stream()
        .mapToDouble(ConPrecio::getPrecio)
        .sum();
  }
  
}

package es.heladeria.helado;

import java.util.Arrays;
import java.util.Objects;

public class CopaHelado implements ConDescripcion, ConPrecio, Comparable<CopaHelado> {
  private static final IngredienteBase BASE_DEFAULT = new IngredienteBase("Vainilla");
  private static final int COMPLEMENTOS_MAXIMO = 3;
  private IngredienteBase base;
  private final Ingrediente[] complementos;
  
  public IngredienteBase getBase() {
    return base;
  }
  
  private void setBase(IngredienteBase base) {
    if (base.sirveComoBase()) {
      this.base = base;
    } else {
      this.base = BASE_DEFAULT;
    }
  }
  
  public Ingrediente[] getComplementos() {
    return complementos;
  }
  
  public CopaHelado() {
    this(BASE_DEFAULT);
  }
  
  public CopaHelado(IngredienteBase base) {
    setBase(base);
    complementos = new Ingrediente[COMPLEMENTOS_MAXIMO];
  }
  
  public boolean addComplemento(Ingrediente ingrediente) {
    boolean anadido = false;
    int numeroDeComplementos = numeroDeComplementos();
    if (numeroDeComplementos < getComplementos().length) {
      getComplementos()[numeroDeComplementos] = ingrediente;
      anadido = true;
    }
    
    return anadido;
  }
  
  // Esto no se pide, solo hecho para que la prueba se vea mejor
  public boolean addComplemento(Ingrediente... ingredientes) {
    boolean anadido = true;
    for (Ingrediente ingrediente : ingredientes) {
      anadido &= addComplemento(ingrediente);
    }
    
    return anadido;
  }
  
  // Tambien podria irse incrementando un campo conforme se agregan complementos
  // en vez de calcularlo dinamicamente, pero hay que controlarlo muy bien
  // Ponerlo en un metodo tiene sentido porque luego se usa mucho (precio, descripcion y comparador)
  public int numeroDeComplementos() {
    int numeroComplementos = 0; 
    for (Ingrediente ingrediente : getComplementos()) {
      if (ingrediente != null) {
        numeroComplementos++;
      }
    }
    
    return numeroComplementos;
  }

  // Esto lo pongo como un ejemplo chulo que usa varias cosas utiles
  private static final String[] TEMPLATES = new String[] { "", " con %s", " con %2$s y %1$s" };
  @Override
  public String getDescripcion() {
    int numeroComplementos = numeroDeComplementos();
    String template = TEMPLATES[Math.min(numeroComplementos, TEMPLATES.length - 1)];
    int ultimoIndex = Math.max(numeroComplementos - 1, 0);
    String antesDeY = String.join(", ", Arrays.copyOf(Arrays.stream(getComplementos())
        .filter(Objects::nonNull)
        .map(Ingrediente::getDescripcion)
        .toArray(String[]::new), // Descripciones de los complementos
        ultimoIndex)); // No cojo la ultima descripcion y se juntan todas con ", " entre ellas
    String complementos = String.format(template, getComplementos()[ultimoIndex], antesDeY);
    
    return "Copa de Helado de " + getBase().getSabor() + complementos;
  }
  
  // Forma basica de hacerlo
//  @Override
//  public String getDescripcion() {
//    String complementos = "";
//    int numeroComplementos = numeroDeComplementos();
//    if (numeroComplementos > 0) {
//      complementos += " con ";
//      for (int i = 0; i < numeroComplementos - 1; i++) {
//        complementos += getComplementos()[i] + ", ";
//      }
//      if (numeroComplementos > 1) {
//        complementos = complementos.substring(0, complementos.length() - 2)
//            + " y " + getComplementos()[numeroComplementos - 1];
//      }
//    }
//    
//    return "Copa de Helado de " + getBase().getSabor() + complementos;
//  }
  
  @Override
  public float getPrecio() {
    float total = getBase().getPrecio();
    for (int i = 0; i < numeroDeComplementos(); i++) {
      total += getComplementos()[i].getPrecio();
    }
    
    return total;
  }

  @Override
  public int compareTo(CopaHelado otra) {
    return -Float.compare(getPrecio(), otra.getPrecio());
  }
  
  @Override
  public String toString() {
    return getDescripcion();
  }
  
}

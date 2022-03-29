package es.heladeria.helado;

import com.github.extras.Extra;

public class ComplementoExterno extends Extra implements Ingrediente {
  
  public ComplementoExterno(String descripcion, float precio) {
    super(descripcion, precio);
  }

  @Override
  public String getDescripcion() {
    return getDescription();
  }

  @Override
  public float getPrecio() {
    return getPrice();
  }

  @Override
  public String toString() {
    return getDescripcion();
  }
  
}

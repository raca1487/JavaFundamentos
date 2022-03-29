package es.heladeria.helado;

public abstract class IngredienteImpl implements Ingrediente {
  private String descripcion;
  private float precio;
  
  @Override
  public String getDescripcion() {
    return descripcion;
  }
  
  @Override
  public float getPrecio() {
    return precio;
  }
  
  protected void setPrecio(float precio) {
    this.precio = precio;
  }

  public IngredienteImpl(String descripcion, float precio) {
    super();
    this.descripcion = descripcion;
    setPrecio(precio);
  }
  
  @Override
  public String toString() {
    return getDescripcion();
  }
  
}

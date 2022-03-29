package es.heladeria.helado;

public class IngredienteBase extends IngredienteImpl {
  private static final float PRECIO_BASE = 2f;
  private String sabor;
  
  public String getSabor() {
    return sabor;
  }
  
  @Override
  public boolean sirveComoBase() {
    return true;
  }
  
  public IngredienteBase(String sabor) {
    super("Bola de " + sabor, PRECIO_BASE);
    this.sabor = sabor;
  }

}

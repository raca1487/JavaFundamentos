package es.heladeria.helado;

public class IngredienteBase extends IngredienteImpl {
	
	private String sabor;
	private static final float PRECIO_DEFAULT = 2f;
	
	public String getSabor() {
		return sabor;
	}
	
	public IngredienteBase(String sabor) {
		super("Bola de " + sabor, PRECIO_DEFAULT);
		this.sabor = sabor;
	}
	
	@Override
	public boolean sirveComoBase() {
		return true;
	}

}

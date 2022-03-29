package es.heladeria.helado;

public class CopaHelado implements Descriptible, Priceable, Comparable<CopaHelado> {

	private IngredienteBase ingredienteBase;
	private final Ingrediente[] COMPLEMENTOS;
	private final int MAXIMO_COMPLEMENTOS = 3;
	private int numeroComplementos = 0;

	public IngredienteBase getIngredienteBase() {
		return ingredienteBase;
	}

	public Ingrediente[] getComplementos() {
		return COMPLEMENTOS;
	}

	public int getNumeroComplementos() {
		return numeroComplementos;
	}

	public CopaHelado() {
		this(new IngredienteBase("Vainilla"));
	}

	public CopaHelado(IngredienteBase ingredienteBase) {
		this.ingredienteBase = ingredienteBase;
		COMPLEMENTOS = new Ingrediente[MAXIMO_COMPLEMENTOS];
	}

	public boolean addComplemento(Ingrediente complemento) {
		boolean agregado = false;
		for (int i = 0; i < getComplementos().length; i++) {
			if (getComplementos()[i] == null) {
				getComplementos()[i] = complemento;
				numeroComplementos++;
				agregado = true;
				break;
			}
		}

		return agregado;
	}

	@Override
	public float getPrecio() {
		float precioTotal = getIngredienteBase().getPrecio();
		for (int i = 0; i < getNumeroComplementos(); i++) {
			precioTotal += getComplementos()[i].getPrecio();
		}

		return precioTotal;
	}

	@Override
	public String getDescripcion() {
		String copa = "Copa de Helado de " + getIngredienteBase().getSabor();
		String complementos = "";
		if (getNumeroComplementos() > 0) {
			complementos += " con ";
			for (int i = 0; i < getNumeroComplementos() - 1; i++) {
				complementos += getComplementos()[i] + ", ";
			}
			if (getNumeroComplementos() == 1) {
				complementos = complementos.substring(0, complementos.length()) + getComplementos()[getNumeroComplementos() - 1];
			}
			if (getNumeroComplementos() > 1) {
				complementos = complementos.substring(0, complementos.length() - 2) + " y "
						+ getComplementos()[getNumeroComplementos() - 1];
			}
		}

		return copa + complementos;
	}

	@Override
	public int compareTo(CopaHelado copaHelado) {
		return Float.compare(copaHelado.getPrecio(), getPrecio());
	}

	@Override
	public String toString() {
		return getDescripcion();
	}

}

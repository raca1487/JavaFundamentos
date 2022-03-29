package mediamarkt;

public class Lavadora extends Electrodomestico {
	
	private final static float CARGA_DEF = 5;
	
	private float carga;

	public float getCarga() {
		return carga;
	}
	
	public Lavadora() {
		super();
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(double precio, String color, char consumoEnergetico, double peso, float carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (carga > 30) {
			precioFinal += 50;
		} else {
			super.precioFinal();
		}
		return precioFinal;
	}
	
}

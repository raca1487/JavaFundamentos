package mediamarkt;

public class Television extends Electrodomestico {

	private final static float RESOLUCION_DEF = 20;
	private final static boolean SINTONIZADORTDT_DEF = false;
	
	private float resolucion;
	private boolean sintonizadorTdt;
	
	public float getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTdt() {
		return sintonizadorTdt;
	}
	
	public Television() {
		super();
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(double precio, String color, char consumoEnergetico, double peso, float resolucion, boolean sintonizadorTdt) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (resolucion > 40) {
			precioFinal = precioFinal * 100 / 30;
		}
		if (sintonizadorTdt == true) {
			precioFinal += precioFinal + 50;
		}
		return precioFinal;
	}
	
	
	
}

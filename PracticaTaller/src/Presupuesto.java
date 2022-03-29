
public class Presupuesto {

	private Averia averia;
	private int numHoras;
	private Repuesto piezaRepuesto;
	private static final double PRECIO_MANO_OBRA = 50;
	
	
	public Averia getAveria() {
		return averia;
	}
	
	public int getNumHoras() {
		return numHoras;
	}
	
	public Repuesto getPiezaRepuesto() {
		return piezaRepuesto;
	}
	
	public Presupuesto(int numHoras, Repuesto piezaRepuesto) {
		this.numHoras = numHoras;
		this.piezaRepuesto = piezaRepuesto;
	}
	
	public double manoObra() {
		return PRECIO_MANO_OBRA * numHoras;
	}
	
	@Override
	public String toString() {
		String informe = "El presupuesto es ";
		return informe + System.lineSeparator() + "Mano de obra: " + manoObra() + " €" + System.lineSeparator()
			+ "Precio pieza: " + getPiezaRepuesto().getPrecio() + " €";
	}
	
}


public class Repuesto implements Identificable<Integer> {

	private int id;
	private String descripcion;
	private double precio;

	@Override
	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public Repuesto(int id, String descripcion, double precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "( " + getId() + " ) " + getDescripcion() + " " + getPrecio() + " €";
	}

}

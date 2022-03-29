
public class Cuenta {

	private String titular;
	private float cantidad;
	
	
	public String getTitular() {
		return titular;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, float cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta\n\tTitular:\t" + getTitular() + "\n\tCantidad:\t" + getCantidad() + " €";
	}
	
	public float ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
		return this.cantidad;
	}
	
	public float retirar(double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad -= cantidad;
		}
		return this.cantidad;
	}
	
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Juanma Ramirez", 15000);
		System.out.println(cuenta1);
		System.out.println("Ingreso 20000 €uros");
		cuenta1.ingresar(20000);
		System.out.println(cuenta1);
		System.out.println("Retiro 25000 €uros");
		cuenta1.retirar(25000);
		System.out.println(cuenta1);
	}
	
}

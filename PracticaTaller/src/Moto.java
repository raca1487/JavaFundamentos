
public class Moto extends Vehiculo {

	public Moto(String matricula, String modelo, String color) {
		super(matricula, modelo, color);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ":" + System.lineSeparator() + super.toString();
	}
}
